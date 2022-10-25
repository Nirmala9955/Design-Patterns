package com.sahu.service;

import com.sahu.dto.TicketBookingDetailsDTO;

public interface ITicketBookingMgmtService {
	public String bookTickets(TicketBookingDetailsDTO dto) throws Exception;
}
