package com.sahu.component;

public final class PetrolEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("Petrol Engine has started");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine has stoped");		
	}

}
