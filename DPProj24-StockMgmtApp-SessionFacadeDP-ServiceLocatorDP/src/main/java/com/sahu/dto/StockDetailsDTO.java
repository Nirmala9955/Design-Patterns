package com.sahu.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class StockDetailsDTO implements Serializable {
	private Long stockId;
	private String stockName;
	private Long currentValue;
	private List<Long> historyValue;
	private List<Long> futureValue;
}
