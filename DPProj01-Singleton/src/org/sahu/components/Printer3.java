package org.sahu.components;

import org.sahu.helper.CommonsUtil;

public class Printer3 extends CommonsUtil {	
	
	private Printer3() {
		System.out.println("Printer.Printer()");
	}
	
	private static class InnerPrinter {
		private volatile static Printer3 INSTANCE = new Printer3();;
	}
	
	//Solution for cloning problem
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("cloning is not allowed in Singleton class");
		//return InnerPrinter.INSTANCE; 
	}
	
	public static Printer3 getInstane() {
		return InnerPrinter.INSTANCE;
	}  
	
}
