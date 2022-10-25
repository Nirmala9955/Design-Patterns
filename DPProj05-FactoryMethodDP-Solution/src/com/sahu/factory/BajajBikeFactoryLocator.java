package com.sahu.factory;

public class BajajBikeFactoryLocator {

	public static BajajBikeFactory buildBikeFactory(Location location) {
		BajajBikeFactory bikeFactory = null;
		if (location == Location.CHENNAI) 
			bikeFactory = new BajajChennaiFactory();
		else if (location == Location.NOIDA) 
			bikeFactory = new BajajNoidaFactory();
		
		return bikeFactory;
	} 
}
