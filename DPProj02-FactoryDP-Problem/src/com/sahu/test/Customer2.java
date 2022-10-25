package com.sahu.test;

import com.sahu.components.BMWCar;
import com.sahu.components.CarTyre;

public class Customer2 {

	public static void main(String[] args) {
		CarTyre tyre = new CarTyre();
		BMWCar car = new BMWCar(tyre);
		car.assemble();
		car.roadTest();
		System.out.println(car);
	}

}
