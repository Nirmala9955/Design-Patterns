package com.sahu.components;

public abstract class HireFresher {
	
	protected boolean conductAptitudeTest() {
		System.out.println("Conducting aptitude test for fresher");
		return true;
	}
	
	protected boolean conductGDTest() {
		System.out.println("Conducting GD test for fresher");
		return true;
	}
	
	protected abstract boolean conductTechnicalTest();

	protected abstract boolean conductCodingTest();

	protected boolean conductHRTest() {
		System.out.println("Conducting HR test for fresher");
		return true;
	}
	
	//Template method defining the skeleton of the algorithm
	public boolean recruitFresher() {
		System.out.println("HireFresher.recruitFresher()");
		if (conductAptitudeTest())
			if (conductGDTest())
				if (conductTechnicalTest())
					if (conductCodingTest())
						if (conductHRTest())
							return true;
		return false;
	}
	
}
