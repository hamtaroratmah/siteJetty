package be.ipl.archpae.ihm;

import javax.servlet.http.HttpServlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;

import be.ipl.archpae.bizz.factories.UserFactory;
import be.ipl.archpae.bizz.ucc.UserUCC;
import be.ipl.archpae.dal.DALManager;
import be.ipl.archpae.dal.dao.UserDAO;
import be.ipl.archpae.utils.AppContext;

public class Main {
	public static void main(String[] args) throws Exception {

		AppContext appContext = new AppContext(args.length == 0 ? "prod.properties" : args[0]);

		DALManager dal = (DALManager) appContext.newInstance(DALManager.class, appContext.getProperties());
		UserFactory userFactory = (UserFactory) appContext.newInstance(UserFactory.class);
		UserDAO userDAO = (UserDAO) appContext.newInstance(UserDAO.class, dal, userFactory);
		UserUCC userUCC = new UserUCC(dal, userDAO);

		startServer(new DispatcherServlet(appContext.getProperty("JWTSecret"), userUCC), appContext);
	}

	private static void startServer(HttpServlet servlet, AppContext appContext) {

		Server server = new Server(Integer.parseInt(appContext.getProperties().getProperty("port")));
		WebAppContext context = new WebAppContext();
		context.setResourceBase("www");
		context.setMaxFormContentSize(50000000);
		context.addServlet(new ServletHolder(servlet), "/");
		server.setHandler(context);
		try {
			server.start();
		} catch (Exception e) {

		}

	}
}
