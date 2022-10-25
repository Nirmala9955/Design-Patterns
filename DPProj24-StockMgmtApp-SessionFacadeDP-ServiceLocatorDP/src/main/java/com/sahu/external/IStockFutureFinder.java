package com.sahu.external;

import java.util.List;

import com.sahu.exception.InvalidStockIdException;

public interface IStockFutureFinder {
	public List<Long> fetchStockFuture(long stockId) throws InvalidStockIdException;
}
