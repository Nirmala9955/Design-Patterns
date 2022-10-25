package com.sahu.external;

import com.sahu.exception.InvalidStockNameException;

public interface IStockIdFinder {
	public long findStockIdByStockName(String stockName) throws InvalidStockNameException;
}
