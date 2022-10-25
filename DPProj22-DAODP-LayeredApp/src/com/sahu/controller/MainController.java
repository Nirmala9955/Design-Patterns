package com.sahu.controller;

import org.apache.log4j.Logger;

import com.sahu.dto.TicketBookingDetailsDTO;
import com.sahu.factory.LogFactory;
import com.sahu.service.ITicketBookingMgmtService;
import com.sahu.service.TicketBookingMgmtServiceImpl;
import com.sahu.vo.TicketBookingDetailsVO;

public class MainController {

	private ITicketBookingMgmtService service;
	
	private static Logger logger = LogFactory.createLoggerObject(MainController.class);
	
	public MainController() {
		service = new TicketBookingMgmtServiceImpl();
		logger.info("service class object created");
	}
	
	public String processTicketBooking(TicketBookingDetailsVO vo) throws Exception {
		logger.debug("inside processTicketBooking(-) method");
		//Convert VO class object to dto class object
		TicketBookingDetailsDTO dto = new TicketBookingDetailsDTO();
		dto.setCustName(vo.getCustName());
		dto.setSeatNo(vo.getSeatNo());
		dto.setTicketCount(Integer.parseInt(vo.getTicketCount()));
		dto.setTicketType(vo.getTicketType());
		logger.debug("VO class object is converted to DTO class object");
		
		//user service
		logger.info("service class business method is used");
		return service.bookTickets(dto);
	}
	
}
