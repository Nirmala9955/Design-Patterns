package org.sahu.components;

public class Printer1 {
    
	private static Printer1 INSTANCE = new Printer1();
	
	private Printer1() {
		System.out.println("Printer1.Printer1()");
	}
	
	public static Printer1 getInstance() {
		return INSTANCE;
	}
	
}
