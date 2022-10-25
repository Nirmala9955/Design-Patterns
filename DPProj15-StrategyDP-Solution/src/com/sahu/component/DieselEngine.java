package com.sahu.component;

public final class DieselEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("Diesel Engine has started");
	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine has stoped");		
	}

}
