package com.sahu.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.sahu.controller.MainController;
import com.sahu.factory.LogFactory;
import com.sahu.vo.TicketBookingDetailsVO;

public class JEELayeredApplicationTest {

	private static Logger logger = LogFactory.createLoggerObject(JEELayeredApplicationTest.class);
	
	public static void main(String[] args) {
		logger.debug("inside main(-) method");
		//read inputs and store them in VO class object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer name : ");
		String name = sc.next();
		System.out.print("Enter tickets count : ");
		int ticketCount = sc.nextInt();
		System.out.print("Choose tickets type : ");
		String ticketType = sc.next();
		System.out.println("Choose seat nos ----- ");
		String seatNo = "";
		for (int i = 1; i <=ticketCount; i++) {
			System.out.print("Enter "+i+" seat no: ");
			seatNo = seatNo+", "+sc.next();
		}
		logger.debug("inputs are read from  enduser");
		
		//prepare VO class object
		TicketBookingDetailsVO detailsVO = new TicketBookingDetailsVO();
		detailsVO.setCustName(name);
		detailsVO.setTicketType(ticketType);
		detailsVO.setTicketCount(String.valueOf(ticketCount));
		detailsVO.setSeatNo(seatNo);
		logger.debug("inputs are stored into VO class object");
		
		//invoke methods by creating object from controller
		MainController controller = new MainController();
		logger.info("Controller class object is created");
		try {
			String result = controller.processTicketBooking(detailsVO);
			logger.info("business method is invoked on controller class object");
			System.out.println("\n"+result);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Internal DB problem : "+e.getMessage());
			System.err.println("Internal DB problem : "+e.getMessage());	
		} catch (Exception e) {
			e.printStackTrace();
			logger.fatal("Unknown Problem : "+e.getMessage());
			System.err.println("Internal Problem : "+e.getMessage());
		}
		logger.debug("end of main(-) method");
	}

}
