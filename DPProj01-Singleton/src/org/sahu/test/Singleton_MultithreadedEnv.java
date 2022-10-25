package org.sahu.test;

import org.sahu.helper.TicketBooking;

public class Singleton_MultithreadedEnv {

	public static void main(String[] args) {
		TicketBooking ticket = new TicketBooking();
		Thread thread1 = new Thread(ticket);
		Thread thread2 = new Thread(ticket);
		Thread thread3 = new Thread(ticket);
		
		long start = System.currentTimeMillis();
		thread1.start();
		thread2.start();
		thread3.start();
		long end = System.currentTimeMillis();
		System.out.println("Time : "+(end-start)+" ms");
	}

}
