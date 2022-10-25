package com.sahu.component;

public final class Vehicle {
	
	private IEngine engine;	//HAS-A property

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}
	
	public void drive(String sourcePlace, String destPlace) {
		System.out.println("Vehicle.drive()");
		engine.start();
		System.out.println("Driving started at "+sourcePlace);
		System.out.println("Driving is going on");
		engine.stop();
		System.out.println("Driving ended at "+destPlace);
	}
	
}
