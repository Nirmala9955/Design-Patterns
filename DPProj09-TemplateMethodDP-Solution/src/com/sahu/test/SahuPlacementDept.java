package com.sahu.test;

import com.sahu.components.HireFresher;
import com.sahu.factory.FresherType;
import com.sahu.factory.HireFresherFactory;

public class SahuPlacementDept {

	public static void main(String[] args) {
		HireFresher javaFresher = HireFresherFactory.getInstance(FresherType.JAVA);
		boolean result = javaFresher.recruitFresher();
		if (result)
			System.out.println("Java fresher is selected");
		else
			System.out.println("Java fresher is selected");
	}
	
}
