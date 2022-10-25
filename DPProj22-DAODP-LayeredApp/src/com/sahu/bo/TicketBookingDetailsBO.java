package com.sahu.bo;

import lombok.Data;

@Data
public class TicketBookingDetailsBO {
	private String custName;
	private Integer ticketCount;
	private String seatNo;
	private String ticketType;
	private Float billAmount;
}
