package com.sahu.test;

import java.util.Arrays;

import com.sahu.component.IBankService;
import com.sahu.factory.BankServiceFactory;

public class Customer1 {

	public static void main(String[] args) {
		IBankService service = BankServiceFactory.getInstance(true);
		System.out.println(service.getClass()+"...."+service.getClass().getSuperclass()+"...."+Arrays.toString(service.getClass().getInterfaces()));
		System.out.println(service.withdraw(100001, 300000));
		System.out.println("------------------");
		System.out.println(service.withdraw(100001, 3000));
	}
	
}
