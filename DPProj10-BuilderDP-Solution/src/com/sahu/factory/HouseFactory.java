package com.sahu.factory;

import com.sahu.builder.ConcreteHouseBuilder;
import com.sahu.builder.IHouseBuilder;
import com.sahu.builder.IglooHouseBuilder;
import com.sahu.builder.MarbleHouseBuilder;
import com.sahu.builder.WoodenHouseBuilder;
import com.sahu.director.CivilEngineer;
import com.sahu.product.House;

public class HouseFactory {

	public static House createHouse(HouseType type) {
		IHouseBuilder builder = null;
		House house = new House();
		if (type.equals(HouseType.WOODEN))
			builder = new WoodenHouseBuilder(house);
		else if (type.equals(HouseType.ICE))
			builder = new IglooHouseBuilder(house);
		else if (type.equals(HouseType.CONCRETE))
			builder = new ConcreteHouseBuilder(house);		
		else if (type.equals(HouseType.MARBLE))
			builder = new MarbleHouseBuilder(house);
		
		//Create Director object
		CivilEngineer engineer = new CivilEngineer(builder);
		house = engineer.buildHouse();
		return house;
	}
	
}
