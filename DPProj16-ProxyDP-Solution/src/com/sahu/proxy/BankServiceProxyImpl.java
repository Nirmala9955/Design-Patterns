package com.sahu.proxy;

import com.sahu.component.BankServiceImpl;
import com.sahu.component.IBankService;

public class BankServiceProxyImpl implements IBankService {

	private IBankService realService;
	
	public BankServiceProxyImpl() {
		realService = new BankServiceImpl();
	}
	
	@Override
	public String withdraw(long accNo, double amount) {
		String msg = null;
		if (amount<=4000)
			msg = realService.withdraw(accNo, amount);
		else {
			msg = realService.withdraw(accNo, 4000);
			msg = msg +"\n**** Only max of 4000 can be withdraw during transition period  ****";
		}
		return msg;
	}

}
