package com.sahu.components;

public class BMWCar implements Car {

	private CarTyre tyre;
	
	public BMWCar(CarTyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public void assemble() {
		System.out.println("BMWCar.assemble()");
	}

	@Override
	public void roadTest() {
		System.out.println("BMWCar.roadTest()");
	}

	@Override
	public String toString() {
		return "BMWCar [tyre=" + tyre + "]";
	}

}
