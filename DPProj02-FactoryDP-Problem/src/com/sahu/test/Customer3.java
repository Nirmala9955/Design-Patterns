package com.sahu.test;

import com.sahu.components.CarTyre;
import com.sahu.components.KIACar;

public class Customer3 {

	public static void main(String[] args) {
		CarTyre tyre = new CarTyre();
		KIACar car = new KIACar(tyre);
		car.assemble();
		car.roadTest();
		System.out.println(car);
	}
	
}

