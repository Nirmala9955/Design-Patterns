package com.sahu.factory;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogFactory {

	public static Logger createLoggerObject(Class<?> clazz) {
		Logger logger = Logger.getLogger(clazz);
		try {
			//Activate log4j by loading its log4j.properties file
			PropertyConfigurator.configure("src/com/sahu/commons/log4j.properties");
			logger.debug("Log4j activated");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return logger;
	}
	
}
