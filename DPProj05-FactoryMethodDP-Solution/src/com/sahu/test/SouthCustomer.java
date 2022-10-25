package com.sahu.test;

import com.sahu.components.BajajBike;
import com.sahu.factory.BajajBikeFactory;
import com.sahu.factory.BajajBikeFactoryLocator;
import com.sahu.factory.BikeType;
import com.sahu.factory.Location;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBikeFactory factory = BajajBikeFactoryLocator.buildBikeFactory(Location.CHENNAI);
		BajajBike bike = factory.orderBike(BikeType.Platinum);
		bike.drive();
	}
	
}
