package com.sahu.external;

import java.util.List;

import com.sahu.exception.InvalidStockIdException;

public interface IStockHistoryFinder {
	public List<Long> fetchStockHistory(long stockId) throws InvalidStockIdException;
}
