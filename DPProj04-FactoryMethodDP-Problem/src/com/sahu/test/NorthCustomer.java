package com.sahu.test;

import com.sahu.components.BajajBikes;
import com.sahu.factory.BajajNoidaFactoy;
import com.sahu.factory.BikeTypes;

public class NorthCustomer {

	public static void main(String[] args) {
		BajajBikes bikes = BajajNoidaFactoy.createBike(BikeTypes.PLATINUM);
		bikes.drive();
	}
	
}
