package com.sahu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.sahu.component.BankServiceImpl;
import com.sahu.component.IBankService;

public class BankProxyHelper implements InvocationHandler {

	private IBankService realService = null;

	public BankProxyHelper() {
		System.out.println("BankPoxyHelper.BankPoxyHelper()");
		realService = new BankServiceImpl();
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object retVal = null;
		if (method.getName().equalsIgnoreCase("withdraw")) {
			if (((double)args[1])<=4000)
				retVal = method.invoke(realService, args);
			else {
				args[1] = 4000;
				retVal = method.invoke(realService, args);
				retVal = retVal+"\n**** Only max of 4000 can be withdraw during transition period ****";
			}
		}
		else {
			retVal = method.invoke(retVal, args);
		}
		return retVal;
	}

}
