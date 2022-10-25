package com.sahu.test;

import com.sahu.component.Vehicle;
import com.sahu.factory.EngineeType;
import com.sahu.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		//Use factory
		Vehicle vehicle = VehicleFactory.getVehicle(EngineeType.DIESEL);
		vehicle.drive("Hyd", "GOA");
	}
	
}
