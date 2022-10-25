package com.sahu.test;

import com.sahu.component.ButterscotchIcecream;
import com.sahu.component.Icecream;
import com.sahu.component.VanillaIcecream;
import com.sahu.decorator.ChocochipsDecorator;
import com.sahu.decorator.DryFruitDecorator;
import com.sahu.decorator.HoneyDecorator;

public class DecoratorDPTest {

	public static void main(String[] args) {
		Icecream icecream1 = new VanillaIcecream();
		icecream1.prepare();
		System.out.println("----------------------");
		Icecream icecream2 = new DryFruitDecorator(new VanillaIcecream());
		icecream2.prepare();
		System.out.println("----------------------");
		Icecream icecream3 = new HoneyDecorator(new DryFruitDecorator(new VanillaIcecream()));
		icecream3.prepare();
		System.out.println("----------------------");
		Icecream icecream4 = new ChocochipsDecorator(new HoneyDecorator(new DryFruitDecorator(new VanillaIcecream())));
		icecream4.prepare();
		System.out.println("----------------------");
		Icecream icecream5 = new ChocochipsDecorator(new HoneyDecorator(new DryFruitDecorator(new ButterscotchIcecream())));
		icecream5.prepare();
	}
	
}
