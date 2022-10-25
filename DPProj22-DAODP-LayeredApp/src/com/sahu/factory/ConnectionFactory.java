package com.sahu.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class ConnectionFactory {
	
	private static Logger logger = LogFactory.createLoggerObject(ConnectionFactory.class);
		
	public static Connection makeConnection(String url, String userName, String password) throws SQLException {
		logger.debug("Inside makeConnection(-,-,-) method");
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,userName, password);
			logger.info("Cpnnection is established");
		} catch (SQLException e) {
			logger.error("Problem in connection establishment "+e.getMessage());
			e.printStackTrace();
			throw e;
		}
		
		return conn;
	}
	
}
