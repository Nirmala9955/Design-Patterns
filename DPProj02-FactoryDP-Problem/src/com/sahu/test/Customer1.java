package com.sahu.test;

import com.sahu.components.AudiCar;
import com.sahu.components.CarTyre;

public class Customer1 {

	public static void main(String[] args) {
		CarTyre tyre = new CarTyre();
		AudiCar car = new AudiCar(tyre);
		car.assemble();
		car.roadTest();
		System.out.println(car);
	}
	
}

