package com.sahu.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class TicketBookingDetailsDTO implements Serializable {
	private String custName;
	private Integer ticketCount;
	private String seatNo;
	private String ticketType;
}
