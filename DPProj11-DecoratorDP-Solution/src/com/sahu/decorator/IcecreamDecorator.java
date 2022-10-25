package com.sahu.decorator;

import com.sahu.component.Icecream;

public abstract class IcecreamDecorator implements Icecream {

	private Icecream icecream;	//Composition

	public IcecreamDecorator(Icecream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public void prepare() {
		icecream.prepare();
	}

}
