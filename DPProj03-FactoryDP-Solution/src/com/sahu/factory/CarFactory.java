package com.sahu.factory;

import com.sahu.components.AudiCar;
import com.sahu.components.BMWCar;
import com.sahu.components.Car;
import com.sahu.components.CarTyre;
import com.sahu.components.KIACar;

public class CarFactory {

	// static factory method
	public static Car getCar(CarType carType) {
		Car car=null;
		//Create Tyre object
		CarTyre tyre = new CarTyre();
		
		if (carType == CarType.BMW) 
			car = new BMWCar(tyre);
		else if (carType == CarType.AUDI) 
			car = new AudiCar(tyre);	
		else 
			car = new KIACar(tyre);
			
		car.assemble();
		car.roadTest();
		return car;
	}
	
}
