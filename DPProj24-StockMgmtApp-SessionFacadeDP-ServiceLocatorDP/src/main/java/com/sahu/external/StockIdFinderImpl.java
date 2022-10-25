package com.sahu.external;

import com.sahu.exception.InvalidStockNameException;

public class StockIdFinderImpl implements IStockIdFinder {

	@Override
	public long findStockIdByStockName(String stockName) throws InvalidStockNameException {
		if (stockName.equalsIgnoreCase("SBI"))
			return 1001;
		else if (stockName.equalsIgnoreCase("ICICI"))
			return 1002;
		else if (stockName.equalsIgnoreCase("Reliance"))
			return 1003;
		else
			throw new InvalidStockNameException("Wrong stock name - "+stockName);
	}

}
