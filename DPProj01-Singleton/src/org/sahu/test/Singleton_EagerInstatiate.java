package org.sahu.test;

public class Singleton_EagerInstatiate {
	
	public static void main(String[] args) {
		try {
			Class<?> clzz1 = Class.forName("org.sahu.components.Printer");
			Class<?> clzz2 = Class.forName("org.sahu.components.Printer");
			
			//Printer writer
			System.out.println(clzz1==clzz2);
			System.out.println(clzz2.hashCode()+" "+clzz2.hashCode());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
}
