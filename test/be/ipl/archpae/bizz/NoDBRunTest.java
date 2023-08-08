package be.ipl.archpae.bizz;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;

import be.ipl.archpae.bizz.impl.UserFactoryImpl;
import be.ipl.archpae.bizz.ucc.UserUCC;
import be.ipl.archpae.dal.impl.UserDAOImpl;
import be.ipl.archpae.ihm.DispatcherServlet;
import be.ipl.archpae.utils.AppContext;
import be.ipl.archpae.utils.BCrypt;

public class NoDBRunTest {
  public static void main(String[] args) throws Exception {
    
    AppContext appContext = new AppContext(args.length == 0 ? "prod.properties" : args[0]);

    Server server = new Server(Integer.parseInt(appContext.getProperties().getProperty("port")));
    WebAppContext context = new WebAppContext();
    context.setResourceBase("www");
    context.setMaxFormContentSize(50000000);
    
    MockDALManager dal=new MockDALManager();
    Object[][] response={{1,"toto",BCrypt.hashpw("toto", BCrypt.gensalt())}};
    System.out.println(response[0][2]);
    dal.prepResponse("SELECT id, login, password FROM pae.users WHERE login=?", response);
    UserUCC userUcc = new UserUCC(dal, new UserDAOImpl(dal, new UserFactoryImpl()));
    
    
    context.addServlet(new ServletHolder(new DispatcherServlet("yolo",userUcc)), "/");
    server.setHandler(context);
    server.start();
    
//    UserDTO user=userUcc.login("toto", "toto");
//    System.out.println(user.getLogin());
  }
}
