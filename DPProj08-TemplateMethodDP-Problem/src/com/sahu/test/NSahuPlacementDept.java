package com.sahu.test;

import com.sahu.components.HireFresher;
import com.sahu.components.HireJavaFresher;

public class NSahuPlacementDept {

	public static void main(String[] args) {
		HireFresher uiFresher = new HireJavaFresher();
		boolean result = uiFresher.conductAptitudeTest();
		if (result)
			result = uiFresher.conductHRTest();
		if (result)
			result = uiFresher.conductGDTest();
		if (result)
			result = uiFresher.conductTechnicalTest();
		if (result)
			System.out.println("Java fresher is selected");
		else 
			System.out.println("Java fresher is not selected");
	}
	
}
