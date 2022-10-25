package com.aw.service;

import java.text.DecimalFormat;

import com.aw.adapter.CityName;
import com.aw.adapter.WeatherReportComponentAdapter;

public class AccuWeatherServiceImpl implements AccuWeatherService {

	@Override
	public String showTemperature(CityName cityName) {
		WeatherReportComponentAdapter adapte = new WeatherReportComponentAdapter();
		double temp = adapte.fetechTemperature(cityName);
		return "Temperature of "+cityName+" is "+new DecimalFormat("0.00").format(temp)+" °C";
	}

}
