package com.sahu.components;

public class KIACar implements Car {

	private CarTyre tyre;
	
	public KIACar(CarTyre tyre) {
		super();
		this.tyre = tyre;
	}

	@Override
	public void assemble() {
		System.out.println("KIACar.assemble()");
	}

	@Override
	public void roadTest() {
		System.out.println("KIACar.roadTest()");
	}

	@Override
	public String toString() {
		return "KIACar [tyre=" + tyre + "]";
	}

}
