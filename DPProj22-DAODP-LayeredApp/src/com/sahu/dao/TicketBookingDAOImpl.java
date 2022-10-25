package com.sahu.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.sahu.bo.TicketBookingDetailsBO;
import com.sahu.factory.ConnectionFactory;

public class TicketBookingDAOImpl implements ITicketBookingDAO {
	
	private static final String INSERT_MOVIE_TICKERT_BOOKING_QUERY = "INSERT INTO MOVIE_TICKET_BOOKING VALUES (TICKET_ID_SEQ.NEXTVAL, ?, ?, ?, ?, ?)";
	
	private static Properties properties;
	
	private static Logger logger = Logger.getLogger(TicketBookingDAOImpl.class);
	
	static {
		try {
			//Activate log4j by loading its log4j.properties file
			PropertyConfigurator.configure("src/com/sahu/commons/log4j.properties");
			logger.debug("Log4j activated");
			//load properties file
			InputStream is = new FileInputStream("src/com/sahu/commons/jdbc.properties");
			logger.debug("jdbc.properties file loaded");
			//store properties file into java.lang.Properties class object
			properties = new Properties();
			properties.load(is);
			logger.debug("jdbc.properties file info is copied to java.util.Properties class object");
		} catch (IOException e) {
			logger.error("Problem in locating jdbc.properties file");
			e.printStackTrace();
		}
	}
	
	@Override
	public int insert(TicketBookingDetailsBO bo) throws Exception {
		logger.debug("Inside insert() method");
		Connection conn = null;
		PreparedStatement pStatement = null;
		int count = 0;
		try {
			//get JDBC connection using connection factory
			conn = ConnectionFactory.makeConnection(properties.getProperty("jdbc.url"), properties.getProperty("jdbc.user"), properties.getProperty("jdbc.password"));
			logger.info("JDBC connection is gathered from JDBC Factory");
			//create PreparedStatement object
			pStatement = conn.prepareStatement(INSERT_MOVIE_TICKERT_BOOKING_QUERY);
			logger.info("PrepareStatement object is created having pre-compiled SQL query");
			//set values to Query params
			pStatement.setString(1, bo.getCustName());
			pStatement.setInt(2, bo.getTicketCount());
			pStatement.setString(3, bo.getTicketType());
			pStatement.setString(4, bo.getSeatNo());
			pStatement.setFloat(5, bo.getBillAmount());
			logger.debug("Values are set to pre-compiled SQL query parameters");
			
			//Execute the query
			count = pStatement.executeUpdate();
			logger.debug("Pre-compiled SQL query is executed");
		} catch (SQLException e) {
			logger.error("Problem in JDBC code execution");
			e.printStackTrace();
			throw e;
		} catch(Exception e) {
			logger.fatal("Unknown problem in JDBC code execution");
			e.printStackTrace();
			throw e;
		}
		finally {
			try {
				if (pStatement!=null)
					pStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
			try {
				if (conn!=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
		
		return count;
	}

}
