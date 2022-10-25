package com.aw.test;

import com.aw.adapter.CityName;
import com.aw.service.AccuWeatherService;
import com.aw.service.AccuWeatherServiceImpl;

public class AdapterDPTest {

	public static void main(String[] args) {
		//Create service class object
		AccuWeatherService service = new AccuWeatherServiceImpl();
		//invoke method
		System.out.println(service.showTemperature(CityName.HYD));
		System.out.println(service.showTemperature(CityName.DELHI));
		System.out.println(service.showTemperature(CityName.MUMBAI));
		System.out.println(service.showTemperature(CityName.CHENNAI));	
	}
	
}
