package org.sahu.components;

import java.io.Serializable;

public enum Printer7 implements Serializable {

	INSTANCE;
	
	//Static Factory method
	public static Printer7 getInstance() {
		return INSTANCE;
	}
	
	//Business method
	public static void print(String msg) {
		System.out.println(msg);
	}
	
}
