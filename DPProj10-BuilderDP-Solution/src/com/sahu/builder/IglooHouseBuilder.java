package com.sahu.builder;

import com.sahu.product.House;
import com.sahu.product.IceBasement;
import com.sahu.product.IceCarvingInterior;
import com.sahu.product.IceRoof;
import com.sahu.product.IceStructure;

public class IglooHouseBuilder implements IHouseBuilder {

	private House house;

	public IglooHouseBuilder(House house) {
		System.out.println("IglooHouseBuilder.IglooHouseBuilder()");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new IceRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new IceBasement());
	}

	@Override
	public void constructStructure() {
		house.setStructure(new IceStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new IceCarvingInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
