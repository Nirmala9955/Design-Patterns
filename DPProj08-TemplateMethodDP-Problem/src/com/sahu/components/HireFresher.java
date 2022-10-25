package com.sahu.components;

public abstract class HireFresher {
	
	public boolean conductAptitudeTest() {
		System.out.println("Conducting aptitude test for fresher");
		return true;
	}
	
	public boolean conductGDTest() {
		System.out.println("Conducting GD test for fresher");
		return true;
	}
	
	public abstract boolean conductTechnicalTest();

	public abstract boolean conductCodingTest();

	public boolean conductHRTest() {
		System.out.println("Conducting HR test for fresher");
		return true;
	}
	
}
