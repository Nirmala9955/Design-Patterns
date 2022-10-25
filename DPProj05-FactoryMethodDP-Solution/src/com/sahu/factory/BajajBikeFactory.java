package com.sahu.factory;

import com.sahu.components.BajajBike;

public abstract class BajajBikeFactory {

	public abstract void paint();
	public abstract void assemble();
	public abstract void roadTest();
	public abstract void oiling();
	public abstract BajajBike createBike(BikeType bikeType);
	
	public BajajBike orderBike(BikeType bikeType) {
		paint();
		assemble();
		oiling();
		BajajBike bike = createBike(bikeType);
		roadTest();
		return bike;
	}
}
