package com.sahu.builder;

import com.sahu.product.ConcreteBasement;
import com.sahu.product.ConcreteRoof;
import com.sahu.product.ConcreteStructure;
import com.sahu.product.GlassInterior;
import com.sahu.product.House;

public class ConcreteHouseBuilder implements IHouseBuilder {

	private House house;

	public ConcreteHouseBuilder(House house) {
		System.out.println("ConcreteHouseBuilder.ConcreteHouseBuilder()");
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
		house.setStructure(new ConcreteStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new GlassInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
