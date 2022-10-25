package com.sahu.external;

import com.sahu.dto.StockDetailsDTO;
import com.sahu.exception.InvalidStockIdException;
import com.sahu.exception.InvalidStockNameException;

public interface IStockDetailsFinderSessionFacade {
	public StockDetailsDTO findCompleteStockDetailsByName(String stockName) throws InvalidStockNameException, InvalidStockIdException;
}
