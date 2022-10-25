package com.sahu.locator;

import java.util.HashMap;
import java.util.Map;

import com.sahu.external.IStockDetailsFinderSessionFacade;
import com.sahu.external.StockDetailsFinderSessionFacadeImpl;

public class StockDetailsSessionFacadeServiceLocator {

	private static StockDetailsSessionFacadeServiceLocator INSTANCE;
	private Map<JndiName, IStockDetailsFinderSessionFacade> cacheMap;
	
	private StockDetailsSessionFacadeServiceLocator() {
		cacheMap = new HashMap<>();
	}

	public static StockDetailsSessionFacadeServiceLocator getInstance() {
		if (INSTANCE==null)
			INSTANCE = new StockDetailsSessionFacadeServiceLocator();
		
		return INSTANCE;
	}
	
	public IStockDetailsFinderSessionFacade getFacade(JndiName jndiName) {
		if (!cacheMap.containsKey(jndiName)) {
			//here also we should write lookup code, since we have taken SessionFacade 
			//as ordinary class we are creating object directly
			IStockDetailsFinderSessionFacade facade = new StockDetailsFinderSessionFacadeImpl();
			cacheMap.put(jndiName, facade);
		}
		return cacheMap.get(jndiName);
	}
	
}
