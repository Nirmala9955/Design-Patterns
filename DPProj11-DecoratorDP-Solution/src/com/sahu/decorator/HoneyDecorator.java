package com.sahu.decorator;

import com.sahu.component.Icecream;

public class HoneyDecorator extends IcecreamDecorator {

	public HoneyDecorator(Icecream icecream) {
		super(icecream);
	}

	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}
	
	public void addHoney() {
		System.out.println("Adding Honey");
	}

}
