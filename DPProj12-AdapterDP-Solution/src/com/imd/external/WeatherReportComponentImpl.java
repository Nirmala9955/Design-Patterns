package com.imd.external;

public class WeatherReportComponentImpl implements WeatherReportComponent{

	private static WeatherReportComponent INSTANCE;
	
	private WeatherReportComponentImpl() {
		
	}
	
	public static WeatherReportComponent getInstance() {
		if (INSTANCE==null)
			INSTANCE = new WeatherReportComponentImpl();
		
		return INSTANCE;
	}
	
	@Override
	public double getTemperature(Integer cityCode) {
		//Get temperature from DB s/w or from IOT device
		double temp = 0.0;
		if (cityCode==100)
			temp = 100 - Math.random();
		else if (cityCode==101)
			temp = 101 - Math.random();
		else if (cityCode==102)
			temp = 102 - Math.random();
		else if (cityCode==103)
			temp = 130 - Math.random();
		
		return temp;
	}

}
