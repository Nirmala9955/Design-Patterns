package com.sahu.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BankProxyHelper implements MethodInterceptor {

	@Override
	public Object intercept(Object realObject, Method realMethod, Object[] args, MethodProxy proxy) throws Throwable {
		Object returnVal = null; 
		if (realMethod.getName().equalsIgnoreCase("withdraw")) {
			if (((double)args[1])<=4000)
				returnVal = proxy.invokeSuper(realObject, args);
			else {
				args[1] = 4000;
				returnVal = proxy.invokeSuper(realObject, args);
				returnVal = returnVal+"\n**** Only max of 4000 can be withdraw during transition period ****";
			}
		}
		else {
			returnVal = proxy.invokeSuper(realObject, args);
		}
		return returnVal;
	}

}
