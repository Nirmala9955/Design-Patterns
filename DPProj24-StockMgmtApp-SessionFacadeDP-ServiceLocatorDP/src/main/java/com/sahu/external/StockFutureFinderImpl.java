package com.sahu.external;

import java.util.List;
import java.util.Random;

import com.sahu.exception.InvalidStockIdException;

public class StockFutureFinderImpl implements IStockFutureFinder {

	@Override
	public List<Long> fetchStockFuture(long stockId) throws InvalidStockIdException {
		long value1 = new Random().nextInt(10000);
		long value2 = Math.round(value1+(value1*0.1));
	
		if (stockId==1001) {
			value1 = value1-10;
		}
		else if (stockId==1002) {
			value1 = value1-100;
			value2 = value1+100;
		}
		else if (stockId==1003) {
			value1 = value1+100;
			value2 = value1-200;
		}
		else
			throw new InvalidStockIdException("Invalid stock id - "+stockId); 
		
		return List.of(value1, value2);
	}

}
