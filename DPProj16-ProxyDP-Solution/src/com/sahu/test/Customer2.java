package com.sahu.test;

import com.sahu.component.IBankService;
import com.sahu.factory.BankServiceFactory;

public class Customer2 {

	public static void main(String[] args) {
		IBankService service = BankServiceFactory.getInstance(false);
		System.out.println(service.withdraw(100002, 300000));
		System.out.println("------------------");
		System.out.println(service.withdraw(100002, 3000));
	}
	
}
