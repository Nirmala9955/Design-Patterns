package org.sahu.components;

public class Printer6 {
	
	//Solution for InvalidClassException
	private static volatile Printer6 INSTANCE;

	//Private constructor for avoid object creation using new keyword
	private Printer6() {
		if (INSTANCE!=null) 
			throw new RuntimeException("Object is already created!!!");
		System.out.println("Printer.Printer()");
	}

	//Factory method to get class object
	public static Printer6 getInstance() {
		//Solution for Multi-Threaded problem
		if (INSTANCE == null) {
			synchronized (Printer6.class) {
				if (INSTANCE == null)
					INSTANCE = new Printer6();
			}
		}

		return INSTANCE;
	}

	// Solution for cloning problem
	@Override
	public Object clone() throws CloneNotSupportedException {
		//throw new CloneNotSupportedException("cloning is not allowed in Singleton class");
		return INSTANCE;
	}

	// Solution for DeSerialization problem
	public Object readResolve() {
		// throw new IllegalArgumentException("Deserialization is not allowed in Singleton class");
		return INSTANCE;
	}

	// Business logic/ method
	public void print(String msg) {
		System.out.println(msg);
	}

}
