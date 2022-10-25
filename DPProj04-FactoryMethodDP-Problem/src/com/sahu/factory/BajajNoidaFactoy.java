package com.sahu.factory;

import com.sahu.components.BajajBikes;
import com.sahu.components.BajajDiscover;
import com.sahu.components.BajajPlatina;
import com.sahu.components.BajajPulsar;

public class BajajNoidaFactoy {

	public static void paint() {
		System.out.println("Painting of Bajaj Bike");
	}
	
	public static void assemble() {
		System.out.println("Assembling of Bajaj Bike");
	}
	
	public static void roadTest() {
		System.out.println("Road Test of Bajaj Bike");
	}
	
	public static void oiling() {
		System.out.println("Oiling of Bajaj Bike");
	}
	
	public static BajajBikes createBike(BikeTypes bikeTypes) {	
		BajajBikes bikes  = null;
		if (bikeTypes==BikeTypes.PULSAR) 
			bikes = new BajajPulsar();
		else if (bikeTypes==BikeTypes.PLATINUM)
			bikes = new BajajPlatina();
		else
			bikes = new BajajDiscover();
		
		paint();
		assemble();
		oiling();
		
		return bikes;
	}
	
}
