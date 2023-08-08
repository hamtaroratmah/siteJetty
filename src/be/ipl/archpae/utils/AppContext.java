package be.ipl.archpae.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AppContext {
	private Properties props;
	  private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public AppContext(String file) {
		props=new Properties();
		try (InputStream input=new FileInputStream(file)){
			props.load(input);
		} catch (FileNotFoundException e) {
			throw new FatalException(e);
		} catch (IOException e) {
			throw new FatalException(e);
		}
		
		try {
		    Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		    logger.setLevel(Level.INFO);
		    FileHandler fileTxt;
			fileTxt = new FileHandler("Logging.txt");
		    Formatter formatterTxt = new SimpleFormatter();
		    fileTxt.setFormatter(formatterTxt);
		    logger.addHandler(fileTxt);
		} catch (SecurityException | IOException e) {
			throw new FatalException(e);
		}
	}
	
	public Properties getProperties() {
		return props;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object newInstance(Class c, Object... params) {
		try {
		    LOGGER.info("newInstance "+c.getName());
			String className=props.getProperty(c.getSimpleName());
			Class classClass=Class.forName(className);
			for(Constructor constructor:classClass.getConstructors()) {
				Class[] paramsTypes=constructor.getParameterTypes();
				if (paramsTypes.length!=params.length) continue;
				boolean ok=true;
				for(int i=0; i<paramsTypes.length; i++) {
					if (!paramsTypes[i].isAssignableFrom(params[i].getClass())) {
						ok=false;
						break;
					}
				}
				if (ok) {
					return constructor.newInstance(params);
				}
			}
			
			throw new FatalException("No constructor for "+c.getName());			
			
		} catch (Exception e) {
			throw new FatalException(e);
		}
		
	}

	public String getProperty(String key) {
		return props.getProperty(key);
	}
}
