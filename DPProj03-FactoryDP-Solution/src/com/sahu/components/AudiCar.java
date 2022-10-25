package com.sahu.components;

public class AudiCar implements Car {

	private CarTyre tyre;
	
	public AudiCar(CarTyre tyre) {
		super();
		this.tyre = tyre;
	}

	@Override
	public void assemble() {
		System.out.println("AudiCar.assemble()");
	}

	@Override
	public void roadTest() {
		System.out.println("AudiCar.roadTest()");
	}

	@Override
	public String toString() {
		return "AudiCar [tyre=" + tyre + "]";
	}

}
