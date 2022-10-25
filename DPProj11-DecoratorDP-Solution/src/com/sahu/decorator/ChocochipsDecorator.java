package com.sahu.decorator;

import com.sahu.component.Icecream;

public class ChocochipsDecorator extends IcecreamDecorator {

	public ChocochipsDecorator(Icecream icecream) {
		super(icecream);
	}

	@Override
	public void prepare() {
		super.prepare();
		addChocochips();
	}
	
	public void addChocochips() {
		System.out.println("Adding Chocochips");
	}

}
