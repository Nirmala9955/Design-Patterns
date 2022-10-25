package com.sahu.factory;

import com.sahu.component.DieselEngine;
import com.sahu.component.IEngine;
import com.sahu.component.PetrolEngine;
import com.sahu.component.Vehicle;

public class VehicleFactory {

	public static Vehicle getVehicle(EngineeType engineeType) {
		IEngine engine = null;
		if (engineeType.equals(EngineeType.DIESEL))
			engine =  new DieselEngine();
		else if (engineeType.equals(EngineeType.PETROL))
			engine =  new PetrolEngine();
		
		//Create target class object
		Vehicle vehicle = new Vehicle();
		//assign dependent class object to target class object
		vehicle.setEngine(engine);
		
		return vehicle;
	}
			
}
