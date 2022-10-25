package com.sahu.factory;

import com.sahu.components.BajajBike;
import com.sahu.components.BajajDiscovery;
import com.sahu.components.BajajPlatina;
import com.sahu.components.BajajPulsar;

public class BajajChennaiFactory extends BajajBikeFactory {

	@Override
	public void paint() {
		System.out.println("Painting of Bajaj Bike");
	}
	
	@Override
	public void assemble() {
		System.out.println("Assembling of Bajaj Bike");
	}
	
	@Override
	public void roadTest() {
		System.out.println("Road Test of Bajaj Bike");
	}
	
	@Override
	public void oiling() {
		System.out.println("Oiling of Bajaj Bike");
	}
	
	@Override
	public BajajBike createBike(BikeType bikeType) {	
		BajajBike bikes  = null;
		if (bikeType==BikeType.Pulsar) 
			bikes = new BajajPulsar();
		else if (bikeType==BikeType.Platinum)
			bikes = new BajajPlatina();
		else
			bikes = new BajajDiscovery();
		return bikes;
	}
	
}
