package com.sahu.test;

import com.sahu.components.HireFresher;
import com.sahu.factory.FresherType;
import com.sahu.factory.HireFresherFactory;

public class NSahuPlacementDept {

	public static void main(String[] args) {
		HireFresher javaFresher = HireFresherFactory.getInstance(FresherType.DOT_NET);
		boolean result = javaFresher.recruitFresher();
		if (result)
			System.out.println(".Net fresher is selected");
		else
			System.out.println(".Net fresher is selected");
	}
	
}
