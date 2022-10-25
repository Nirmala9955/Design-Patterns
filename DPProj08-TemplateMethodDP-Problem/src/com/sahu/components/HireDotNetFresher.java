package com.sahu.components;

public class HireDotNetFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HireDotNetFresher conducting .Net technical test");
		return false;
	}

	@Override
	public boolean conductCodingTest() {
		System.out.println("HireDotNetFresher conducting .Net coding test");
		return false;
	}

}
