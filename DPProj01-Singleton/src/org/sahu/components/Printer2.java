package org.sahu.components;

public class Printer2 {
    	
	private Printer2() {
		System.out.println("Printer.Printer()");
	}
	
	private static class InnerPrinter {
		private volatile static Printer2 INSTANCE = new Printer2();;
	}
	
	public static Printer2 getInstane() {
		return InnerPrinter.INSTANCE;
	}  
	
}
