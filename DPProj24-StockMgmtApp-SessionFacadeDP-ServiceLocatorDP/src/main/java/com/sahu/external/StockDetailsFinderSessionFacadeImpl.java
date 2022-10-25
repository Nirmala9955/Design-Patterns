package com.sahu.external;

import java.util.List;

import com.sahu.dto.StockDetailsDTO;
import com.sahu.exception.InvalidStockIdException;
import com.sahu.exception.InvalidStockNameException;

public class StockDetailsFinderSessionFacadeImpl implements IStockDetailsFinderSessionFacade {

	@Override
	public StockDetailsDTO findCompleteStockDetailsByName(String stockName)
			throws InvalidStockNameException, InvalidStockIdException {
		//Invoke other Components (here multiple Jndi lookup should happen, but we are creating objects directly
		//because we have external components as the ordinary java classes).
		IStockIdFinder comp1 = new StockIdFinderImpl();
		long stockId = comp1.findStockIdByStockName(stockName);
	
		IStockCurrentValueFinder comp2 = new StockCurrentValueFinderImpl();
		long currentValue =  comp2.findStockCurrentValue(stockId);
		
		IStockHistoryFinder comp3 = new StockHistoryFinderImpl();
		List<Long> historyValueList =  comp3.fetchStockHistory(stockId);
		
		IStockFutureFinder comp4 = new StockFutureFinderImpl();
		List<Long> futureValueList = comp4.fetchStockFuture(stockId);
		
		//Prepare DTO class having multiple details
		StockDetailsDTO dto = new StockDetailsDTO();
		dto.setStockId(stockId);
		dto.setStockName(stockName);
		dto.setCurrentValue(currentValue);
		dto.setHistoryValue(historyValueList);
		dto.setFutureValue(futureValueList);
		
		return dto;
	}

}
