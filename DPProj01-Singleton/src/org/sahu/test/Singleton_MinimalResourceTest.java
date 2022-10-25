package org.sahu.test;

import org.sahu.components.Printer;

public class Singleton_MinimalResourceTest {
	
	public static void main(String[] args) {
		Printer print1 = Printer.getInstane();
		Printer print2 = Printer.getInstane();
		System.out.println(print1==print2);
		System.out.println(print1.hashCode()+" "+print2.hashCode());
	}
}
