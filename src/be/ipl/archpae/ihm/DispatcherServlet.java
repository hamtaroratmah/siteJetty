package be.ipl.archpae.ihm;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.servlet.DefaultServlet;

import com.auth0.jwt.JWTSigner;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.JWTVerifyException;
import com.owlike.genson.Genson;

import be.ipl.archpae.bizz.dto.BizUser;
import be.ipl.archpae.bizz.dto.UserDTO;
import be.ipl.archpae.bizz.ucc.UserUCC;
import be.ipl.archpae.utils.BizException;
import be.ipl.archpae.utils.FatalException;

public class DispatcherServlet extends DefaultServlet {

  /**
   * 
   */
  private static final long serialVersionUID = 6439055220661527992L;
  private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
  private final UserUCC userUcc;
  private final Genson genson;
  private final String secret;

  public DispatcherServlet(String secret, UserUCC userUcc) {
    this.secret = secret;
    this.userUcc = userUcc;
    this.genson = new Genson();
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    if ("/dispatch".equals(req.getRequestURI())) {
      String reply;
      try {
        Object ret = dispatch(req, resp);
        reply = genson.serialize(ret);
      } catch (BizException e) {
        resp.setStatus(HttpStatus.BAD_REQUEST_400);
        reply = e.getMessage();
      } catch (Exception e) {
        resp.setStatus(HttpStatus.INTERNAL_SERVER_ERROR_500);
        reply = e.getMessage();
      }

      Map<String, String[]> params = new HashMap<String, String[]>(req.getParameterMap());
      params.remove("password"); // do not log this
      LOGGER.info(req.getRemoteAddr() + req.getRequestURI() + " | " + genson.serialize(params) + " "
          + resp.getStatus() + " => " + reply.substring(0, Math.min(reply.length(), 100)));

      resp.setContentLength(reply.getBytes("UTF-8").length);
      resp.setCharacterEncoding("utf-8");
      resp.setContentType("application/json");
      resp.getOutputStream().write(reply.getBytes("UTF-8"));
      resp.flushBuffer();

    } else {
      super.doPost(req, resp);
      LOGGER.info(req.getRemoteAddr() + req.getRequestURI() + " | "
          + genson.serialize(req.getParameterMap()) + " " + resp.getStatus());
    }
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    if ("/".equals(req.getRequestURI())) { // assemble screens
      Files.copy(new File("inc/header.html").toPath(), resp.getOutputStream());
      for (File f : new File("inc").listFiles()) {
        if (f.getName().startsWith("_") && f.getName().endsWith(".html")) {
          Files.copy(f.toPath(), resp.getOutputStream());
        }
      }
      Files.copy(new File("inc/prefooter.html").toPath(), resp.getOutputStream());
      for (File f : new File("www/js").listFiles()) {
        if (f.getName().endsWith(".js")) {
          print(resp.getOutputStream(), "<script src=\"js/" + f.getName() + "\"></script>");
        }
      }
      Files.copy(new File("inc/footer.html").toPath(), resp.getOutputStream());
    } else { // let DefaultServlet do its magic
      super.doGet(req, resp);
    }
    
    LOGGER.info(req.getRemoteAddr() + req.getRequestURI() + " | "
        + " " + resp.getStatus());
  }

  private void print(ServletOutputStream outputStream, String string) {
    try {
      outputStream.write(string.getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      throw new FatalException("Invalid UTF8 Encoder");
    }
  }

  private Object dispatch(HttpServletRequest req, HttpServletResponse resp) {
    switch (req.getParameter("action")) { // first the actions that do not need the user logged in
      case "user/islogged":
        return getUser(req, resp) != null;
      case "user/login":
        if (getUser(req, resp) != null) {
          throw new BizException("Already logged in");
        }
        UserDTO user = userUcc.login(req.getParameter("login"), req.getParameter("password"));
        if (user == null) {
          return false;
        } else {
          storeLogin(req, resp, user);
          return true;
        }
    };

    // now we need a user
    UserDTO user = getUser(req, resp);
    if (user == null) {
      throw new BizException("Not Logged In");
    }

    switch (req.getParameter("action")) {
      case "user/logout":
        return logout(req, resp);
      default:
        throw new BizException("Invalid query");
    }
  }

  private boolean logout(HttpServletRequest req, HttpServletResponse resp) {
    req.getSession().removeAttribute("user");
    req.getSession().invalidate();
    Cookie cookie = new Cookie("user", "");
    cookie.setMaxAge(0);
    cookie.setPath("/");
    resp.addCookie(cookie);
    return true;
  }

  private void storeLogin(HttpServletRequest req, HttpServletResponse resp, UserDTO user) {
    Map<String, Object> claims = new HashMap<String, Object>();
    claims.put("login", user.getLogin());
    claims.put("id", ((BizUser) user).getID());
    claims.put("ts", System.currentTimeMillis());
    String jwttoken = new JWTSigner(this.secret).sign(claims);
    Cookie cookie = new Cookie("user", jwttoken);
    cookie.setPath("/");
    cookie.setMaxAge(60 * 60 * 24 * 365);
    resp.addCookie(cookie);
    req.getSession().setAttribute("user", user);
  }

  private UserDTO getUser(HttpServletRequest req, HttpServletResponse resp) {
    UserDTO user = (UserDTO) req.getSession().getAttribute("user");
    if (user != null)
      return user; // user is in session
    String token = null;
    Cookie[] cookies = req.getCookies();
    if (cookies == null)
      return null;
    for (Cookie c : cookies) { // find user cookie
      if ("user".equals(c.getName()) && c.getSecure()) {
        token = c.getValue();
      } else if ("user".equals(c.getName()) && token == null) {
        token = c.getValue();
      }
    }

    Map<String, Object> decodedPayload = null;
    try {
      decodedPayload = new JWTVerifier(secret).verify(token); // decode
    } catch (InvalidKeyException | NoSuchAlgorithmException | IllegalStateException
        | SignatureException | IOException | JWTVerifyException e) {
      logout(req, resp); // cookie not valid, logout will remove it
      return null;
    }
    int id = (int) decodedPayload.get("id");
    user = userUcc.getUser((String) decodedPayload.get("login"));
    if (user == null)
      return null;
    if (id != ((BizUser) user).getID()) {
      logout(req, resp); // cookie not valid, logout will remove it
      return null;
    }

    req.getSession().setAttribute("user", user); // save it in session
    return user;
  }

}
