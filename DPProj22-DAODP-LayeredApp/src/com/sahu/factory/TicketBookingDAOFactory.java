package com.sahu.factory;

import org.apache.log4j.Logger;

import com.sahu.dao.ITicketBookingDAO;
import com.sahu.dao.TicketBookingDAOImpl;

public class TicketBookingDAOFactory {

	private static Logger logger = LogFactory.createLoggerObject(TicketBookingDAOFactory.class);
	
	public static ITicketBookingDAO getInstance(DAOType daoType) {
		logger.debug("inside getInstance(-) method");
		ITicketBookingDAO dao = null;
		if (daoType.equals(DAOType.JDBC))
			dao = new TicketBookingDAOImpl();
		
		logger.info("Creating and returning DAO class object");
		return dao;
	}
	
}
