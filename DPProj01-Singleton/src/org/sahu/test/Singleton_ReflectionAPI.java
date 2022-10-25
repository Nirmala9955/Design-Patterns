package org.sahu.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.sahu.components.Printer5;

public class Singleton_ReflectionAPI {

	public static void main(String[] args) {
		//Get the printer class object using static factory method
		Printer5 printer = Printer5.getInstane();
		
		try {
			//Get the Class object having printer class
			Class clzz = printer.getClass();
			//Get all the constructor available in Printer class
			Constructor cons[] = clzz.getDeclaredConstructors();
			cons[1].setAccessible(true);
			//Create Object using Reflection API
			Printer5 printer1 = (Printer5) cons[1].newInstance();
			Printer5 printer2 = (Printer5) cons[1].newInstance();
			System.out.println("Objects are created using reflection API");
			System.out.println(printer.hashCode()+" "+printer1.hashCode()+" "+printer2.hashCode());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}	

	}

}