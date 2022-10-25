package com.sahu.test;

import com.sahu.components.Car;
import com.sahu.factory.CarFactory;
import com.sahu.factory.CarType;

public class Customer1 {

	public static void main(String[] args) {
		Car car = CarFactory.getCar(CarType.BMW);
		System.out.println(car);
	}
	
}

