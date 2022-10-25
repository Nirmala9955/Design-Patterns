package com.sahu.components;

public class HireUIFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HireUIFresher conducting UI technical test");
		return false;
	}

	@Override
	public boolean conductCodingTest() {
		System.out.println("HireUIFresher conducting UI coding test");
		return false;
	}

}
