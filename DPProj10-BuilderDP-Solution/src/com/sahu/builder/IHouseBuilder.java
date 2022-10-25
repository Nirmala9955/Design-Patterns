package com.sahu.builder;

import com.sahu.product.House;

public interface IHouseBuilder {
	public void constructRoof();
	public void constructBasement();
	public void constructStructure();
	public void constructInterior();
	public House getHouse();
}
