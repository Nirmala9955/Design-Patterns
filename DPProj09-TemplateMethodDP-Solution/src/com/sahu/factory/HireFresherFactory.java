package com.sahu.factory;

import com.sahu.components.HireDotNetFresher;
import com.sahu.components.HireFresher;
import com.sahu.components.HireJavaFresher;
import com.sahu.components.HireUIFresher;

public class HireFresherFactory {
	
	public static HireFresher getInstance(FresherType fresherType) {
		HireFresher fresher = null;
		if (fresherType.equals(FresherType.JAVA)) {
			fresher =  new HireJavaFresher(); 
		}
		else if (fresherType.equals(FresherType.DOT_NET)) {
			fresher =  new HireDotNetFresher(); 
		}
		if (fresherType.equals(FresherType.UI)) {
			fresher =new HireUIFresher(); 
		}
		
		return fresher;
	}
	
}
