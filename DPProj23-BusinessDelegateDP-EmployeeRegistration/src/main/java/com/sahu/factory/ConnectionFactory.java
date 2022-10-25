package com.sahu.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {

	public static Connection getPooledConnection() throws SQLException, NamingException {
		//create ResourceBundle class object
		ResourceBundle bundle = ResourceBundle.getBundle("com/sahu/commons/jdbc");
		//get value from properties file by giving key
		String jndi = bundle.getString("ds.jndi.name");
		//create initialContext object
		InitialContext ic = new InitialContext();
		//get DataSource object from Jndi registry through jndi lookup operation
		DataSource ds = (DataSource) ic.lookup(jndi);
		//get pooled JDBC connection using DataSource object
		Connection con = ds.getConnection();
		return con;
	}
	
	public static void closeConnection(Connection con) throws SQLException {
		con.close();
	}
	
}
