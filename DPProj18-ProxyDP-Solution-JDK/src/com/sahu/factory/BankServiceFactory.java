package com.sahu.factory;

import java.lang.reflect.Proxy;

import com.sahu.component.BankServiceImpl;
import com.sahu.component.IBankService;
import com.sahu.proxy.BankProxyHelper;

public class BankServiceFactory {

	public static IBankService getInstance(boolean demonetization) {
		IBankService service = null;
		if (demonetization)
			service =(IBankService) Proxy.newProxyInstance(IBankService.class.getClassLoader(), new Class[] {IBankService.class}, new BankProxyHelper());
		else
			service  =  new BankServiceImpl();
		
		return service; 
	}
	
}