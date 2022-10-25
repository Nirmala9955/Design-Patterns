package com.sahu.test;

import com.sahu.components.BajajBikes;
import com.sahu.factory.BajajChennaiFactory;
import com.sahu.factory.BikeTypes;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBikes bikes = BajajChennaiFactory.createBike(BikeTypes.PLATINUM);
		bikes.drive();
	}
	
}
