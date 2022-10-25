package com.sahu.service;

import org.apache.log4j.Logger;

import com.sahu.bo.TicketBookingDetailsBO;
import com.sahu.dao.ITicketBookingDAO;
import com.sahu.dto.TicketBookingDetailsDTO;
import com.sahu.factory.DAOType;
import com.sahu.factory.LogFactory;
import com.sahu.factory.TicketBookingDAOFactory;

public class TicketBookingMgmtServiceImpl implements ITicketBookingMgmtService {

	private ITicketBookingDAO dao = null;
	
	private static Logger logger = LogFactory.createLoggerObject(TicketBookingMgmtServiceImpl.class);
	
	public TicketBookingMgmtServiceImpl() {
		dao = TicketBookingDAOFactory.getInstance(DAOType.JDBC);
		logger.debug("DAO class object is gathered");
	}
	
	@Override
	public String bookTickets(TicketBookingDetailsDTO dto) throws Exception {
		logger.debug("inside bookTickets(-) method");
		//calculate bill amount
		float price = 0.0f;
		if(dto.getTicketType().equalsIgnoreCase("reclainer"))
			price = 200.0f;
		else
			price = 150.0f;
	
		float billAmount = dto.getTicketCount()*price;
		logger.debug("Business logic executed and bill amount calculated");
		//prepare BO class object having persistence data
		TicketBookingDetailsBO bo = new TicketBookingDetailsBO();
		bo.setCustName(dto.getCustName());
		bo.setSeatNo(dto.getSeatNo());
		bo.setTicketCount(dto.getTicketCount());
		bo.setTicketType(dto.getTicketType());
		bo.setBillAmount(billAmount);
		logger.debug("BO class object is created");
		
		//use DAO
		int count = dao.insert(bo);
		logger.info("DAO class insert(-) method invoked");
		
		return count==0?"Tickets are not booking":"Tickets has booked";
	}

}
