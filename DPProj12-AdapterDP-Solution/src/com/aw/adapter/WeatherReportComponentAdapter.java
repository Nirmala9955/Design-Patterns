package com.aw.adapter;

import com.imd.external.WeatherReportComponent;
import com.imd.external.WeatherReportComponentImpl;

public class WeatherReportComponentAdapter {

	public double fetechTemperature(CityName cityName) {
		//Get city ode based on the city name (we can get by taking from DB s/w or Web services component)
		int cityCode = 0;
		if (cityName.equals(CityName.HYD))
			cityCode = 100;
		else if (cityName.equals(CityName.DELHI))
			cityCode = 101;
		else if (cityName.equals(CityName.MUMBAI))
			cityCode = 102;
		else if (cityName.equals(CityName.CHENNAI))
			cityCode = 103;
		
		//Get External component reference
		WeatherReportComponent exComponent = WeatherReportComponentImpl.getInstance();
		//Invoke business method on external component reference
		double temp = exComponent.getTemperature(cityCode);
		//converting temperature from Fahrenheit degrees (°F) to Celsius degrees (°C).
		temp =  ((temp-32)*5)/9;
		
		return temp;
	}
	
}
