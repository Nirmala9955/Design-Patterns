package com.sahu.components;

public class HireJavaFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HireJavaFresher conducting Java technical test");
		return false;
	}

	@Override
	public boolean conductCodingTest() {
		System.out.println("HireJavaFresher conducting Java coding test");
		return false;
	}

}
