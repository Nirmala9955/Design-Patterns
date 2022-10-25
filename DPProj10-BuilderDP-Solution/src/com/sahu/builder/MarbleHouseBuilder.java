package com.sahu.builder;

import com.sahu.product.ConcreteBasement;
import com.sahu.product.ConcreteRoof;
import com.sahu.product.House;
import com.sahu.product.IronStructure;
import com.sahu.product.MixedInterior;

public class MarbleHouseBuilder implements IHouseBuilder {

	private House house;

	public MarbleHouseBuilder(House house) {
		System.out.println("MarbleHouseBuilder.MarbleHouseBuilder()");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new ConcreteRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new ConcreteBasement());
	}

	@Override
	public void constructStructure() {
		house.setStructure(new IronStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new MixedInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
