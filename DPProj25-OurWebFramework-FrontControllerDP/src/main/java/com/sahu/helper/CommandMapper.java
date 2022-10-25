package com.sahu.helper;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import com.sahu.command.ICommand;

public class CommandMapper {
	
	private static ResourceBundle bundle;
	
	static {
		bundle = ResourceBundle.getBundle("com/sahu/commons/config");
	}
	
	public static ICommand mapRequestToCommand(String reqUrl, HttpServletRequest req) throws Exception {
		//get command class name from properties by giving incoming request URL
		String className = bundle.getString(reqUrl);
		//Load and instantiate command class
		Class<?> clazz  = Class.forName(className);
		ICommand command  = (ICommand) (clazz.getDeclaredConstructors()[0]).newInstance();
		return command;
	}
	
}
