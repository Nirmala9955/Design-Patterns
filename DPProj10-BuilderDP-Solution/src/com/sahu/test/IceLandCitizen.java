package com.sahu.test;

import com.sahu.factory.HouseFactory;
import com.sahu.factory.HouseType;
import com.sahu.product.House;

public class IceLandCitizen {

	public static void main(String[] args) {
		House house = HouseFactory.createHouse(HouseType.ICE);
		System.out.println(house);
	}
	
}
