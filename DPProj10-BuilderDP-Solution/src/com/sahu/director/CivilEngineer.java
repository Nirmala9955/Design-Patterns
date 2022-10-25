package com.sahu.director;

import com.sahu.builder.IHouseBuilder;
import com.sahu.product.House;

public class CivilEngineer {
	
	private IHouseBuilder builder;

	public CivilEngineer(IHouseBuilder builder) {
		this.builder = builder;
	}
	
	//Builder design pattern main method, Defining the process to construct complex object
	public House buildHouse() {
		builder.constructBasement();
		builder.constructStructure();
		builder.constructRoof();
		builder.constructInterior();
		
		return builder.getHouse();
	}
	
}
