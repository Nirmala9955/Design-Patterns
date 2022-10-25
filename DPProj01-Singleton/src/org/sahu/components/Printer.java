package org.sahu.components;

public class Printer {
    
	private static volatile Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer.Printer()");
	}
	
	/*public static Printer getInstane() {
		if(INSTANCE==null)
			INSTANCE = new Printer();
		
		return INSTANCE;
	}*/
	
	/*public static synchronized Printer getInstane() {
		if(INSTANCE==null)
			INSTANCE = new Printer();
		
		return INSTANCE;
	} */
	
	public static Printer getInstane() {
		 if (INSTANCE==null) {			
			synchronized(Printer.class) {
				if(INSTANCE==null)
					INSTANCE = new Printer();
			}
		}
		
		return INSTANCE;
	}  
	
}
