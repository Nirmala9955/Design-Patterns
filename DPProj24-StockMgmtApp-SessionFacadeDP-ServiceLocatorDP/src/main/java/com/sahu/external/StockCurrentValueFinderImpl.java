package com.sahu.external;

import java.util.Random;

import com.sahu.exception.InvalidStockIdException;

public class StockCurrentValueFinderImpl implements IStockCurrentValueFinder {

	@Override
	public long findStockCurrentValue(long stockId) throws InvalidStockIdException {
		long stockValue = new Random(1000L).nextLong();
		if (stockId==1001)
			return stockValue+100;
		else if (stockId==1002)
			return stockValue+125;		
		else if (stockId==1003)
			return stockValue+75;
		else
			throw new InvalidStockIdException("Invalid stock id - "+stockId);
	}

}
