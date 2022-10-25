package org.sahu.components;

import org.sahu.helper.CommonsUtil2;

public class Printer4 extends CommonsUtil2 {
	
	//Solution for InvalidClassException
	private static final long serialVersionUID = -2105646988646364920L;
	
	//Private constructor for above object creation using new keyword
	private Printer4() {
		System.out.println("Printer.Printer()");
	}
	
	//Solution for Multi-Threaded problem
	private static class InnerPrinter {
		private volatile static Printer4 INSTANCE = new Printer4();;
	}
	
	//Solution for cloning problem
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("cloning is not allowed in Singleton class");
		//return InnerPrinter.INSTANCE; 
	}
	
	//Solution for DeSerialization problem
	public Object readResolve() {
		//throw new IllegalArgumentException("Deserialization is not allowed in Singleton class");
		return InnerPrinter.INSTANCE;
	}
	
	//Factory method to get class object
	public static Printer4 getInstane() {
		return InnerPrinter.INSTANCE;
	}  
	
	//Business logic/ method
	public void print(String msg) {
		System.out.println(msg);
	}
		
}
