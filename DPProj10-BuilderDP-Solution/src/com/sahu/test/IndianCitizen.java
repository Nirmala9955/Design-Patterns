package com.sahu.test;

import com.sahu.factory.HouseFactory;
import com.sahu.factory.HouseType;
import com.sahu.product.House;

public class IndianCitizen {

	public static void main(String[] args) {
		House house = HouseFactory.createHouse(HouseType.CONCRETE);
		System.out.println(house);
	}
	
}
