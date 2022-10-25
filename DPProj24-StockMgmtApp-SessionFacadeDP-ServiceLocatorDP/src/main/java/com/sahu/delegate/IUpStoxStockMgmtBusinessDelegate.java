package com.sahu.delegate;

import com.sahu.dto.StockDetailsDTO;
import com.sahu.exception.InternalProblemException;

public interface IUpStoxStockMgmtBusinessDelegate {
	public StockDetailsDTO fetchStockDetailsByName(String stockName) throws InternalProblemException;
}
