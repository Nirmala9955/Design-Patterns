package com.sahu.delegate;

import com.sahu.dto.StockDetailsDTO;
import com.sahu.exception.InternalProblemException;
import com.sahu.exception.InvalidStockIdException;
import com.sahu.exception.InvalidStockNameException;
import com.sahu.external.IStockDetailsFinderSessionFacade;
import com.sahu.locator.JndiName;
import com.sahu.locator.StockDetailsSessionFacadeServiceLocator;

public class UpStoxStockMgmtBusinessDelegateImpl implements IUpStoxStockMgmtBusinessDelegate {

	@Override
	public StockDetailsDTO fetchStockDetailsByName(String stockName) throws InternalProblemException {
		//get SessionFacade component reference using ServicLocator
		try {
			StockDetailsSessionFacadeServiceLocator locator = StockDetailsSessionFacadeServiceLocator.getInstance();
			IStockDetailsFinderSessionFacade facade = locator.getFacade(JndiName.STOCK_JNDI);
			//Invoke business method
			StockDetailsDTO dto = facade.findCompleteStockDetailsByName(stockName);
			return dto;
		}
		catch (InvalidStockNameException isne) {
			throw new InternalProblemException(isne.getMessage());
		} catch (InvalidStockIdException isie) {
			throw new InternalProblemException(isie.getMessage());
		}
	}

}
