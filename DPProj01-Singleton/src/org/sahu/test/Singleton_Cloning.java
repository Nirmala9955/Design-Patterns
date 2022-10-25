package org.sahu.test;

import org.sahu.components.Printer3;

public class Singleton_Cloning {

	public static void main(String[] args) {
		Printer3 printer1 = Printer3.getInstane();
		try {
			Printer3 printer2 = (Printer3) printer1.clone();
			System.out.println("Clone is created");
			System.out.println(printer1.hashCode()+" "+printer2.hashCode());
			System.out.println("printer1==printer2 : "+(printer1==printer2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		  
	}

}