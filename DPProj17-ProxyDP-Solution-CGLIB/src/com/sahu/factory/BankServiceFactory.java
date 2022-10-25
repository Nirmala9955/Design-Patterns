package com.sahu.factory;

import com.sahu.component.BankServiceImpl;
import com.sahu.proxy.BankProxyHelper;

import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {

	public static BankServiceImpl getInstance(boolean demonetization) {
		BankServiceImpl service = null;
		if (demonetization)
			service = (BankServiceImpl) Enhancer.create(BankServiceImpl.class, new BankProxyHelper());
		else
			service  =  new BankServiceImpl();
		
		return service; 
	}
	
}