package com.sahu.component;

public class BankServiceImpl implements IBankService {

	@Override
	public String withdraw(long accNo, double amount) {
		return "Withdrawing amount "+amount+" from account number "+accNo;
	}

}
