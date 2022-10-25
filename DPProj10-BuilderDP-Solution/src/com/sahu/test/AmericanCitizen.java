package com.sahu.test;

import com.sahu.factory.HouseFactory;
import com.sahu.factory.HouseType;
import com.sahu.product.House;

public class AmericanCitizen {

	public static void main(String[] args) {
		House house = HouseFactory.createHouse(HouseType.WOODEN);
		System.out.println(house);
	}
	
}
