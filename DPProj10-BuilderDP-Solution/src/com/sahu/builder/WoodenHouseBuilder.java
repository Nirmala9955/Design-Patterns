package com.sahu.builder;

import com.sahu.product.House;
import com.sahu.product.WoodenBasement;
import com.sahu.product.WoodenInterior;
import com.sahu.product.WoodenRoof;
import com.sahu.product.WoodenStructure;

public class WoodenHouseBuilder implements IHouseBuilder {

	private House house;

	public WoodenHouseBuilder(House house) {
		System.out.println("WoodenHouseBuilder.WoodenHouseBuilder()");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new WoodenRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new WoodenBasement());
	}

	@Override
	public void constructStructure() {
		house.setStructure(new WoodenStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new WoodenInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
