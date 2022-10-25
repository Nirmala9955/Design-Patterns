package com.sahu.decorator;

import com.sahu.component.Icecream;

public class DryFruitDecorator extends IcecreamDecorator {

	public DryFruitDecorator(Icecream icecream) {
		super(icecream);
	}

	@Override
	public void prepare() {
		super.prepare();
		addDryFruits();
	}
	
	public void addDryFruits() {
		System.out.println("Adding Dry Fruits");
	}

}
