package com.sahu.external;

import com.sahu.exception.InvalidStockIdException;

public interface IStockCurrentValueFinder {
	public long findStockCurrentValue(long stockId) throws InvalidStockIdException;
}
