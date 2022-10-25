package org.sahu.helper;

import org.sahu.components.Printer2;

public class TicketBooking implements Runnable {

	@Override
	public void run() {
		Printer2 printer = Printer2.getInstane();
		System.out.println(printer.hashCode());
	
		/*try {
			Class clazz = Class.forName("org.sahu.components.TypeWriter");
			System.out.println(clazz.hashCode());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		
	}

}
