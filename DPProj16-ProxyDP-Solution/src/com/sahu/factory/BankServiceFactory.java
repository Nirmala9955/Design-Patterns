package com.sahu.factory;

import com.sahu.component.BankServiceImpl;
import com.sahu.component.IBankService;
import com.sahu.proxy.BankServiceProxyImpl;

public class BankServiceFactory {

	public static IBankService getInstance(boolean demonetization) {
		IBankService service = null;
		if (demonetization)
			service = new BankServiceProxyImpl();
		else
			service  =  new BankServiceImpl();
		
		return service; 
	}
	
}