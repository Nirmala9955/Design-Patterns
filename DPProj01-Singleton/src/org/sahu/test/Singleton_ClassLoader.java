package org.sahu.test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import org.sahu.components.Printer7;

public class Singleton_ClassLoader {

	public static void main(String[] args) throws Exception {
		//Using default class loader
		Printer7 printer = Printer7.INSTANCE;
		System.out.println(printer.getClass().getClassLoader());
		System.out.println(printer.hashCode());
		System.out.println("--------------------------------");
		//Using Custom class loader
		//URLClassLoader classloader = new URLClassLoader(new URL[] {new URL("file:E:/JAVA/Workspace/DesignPattern/sdp.jar")}, null);
		URLClassLoader classloader = new URLClassLoader(new URL[] {new URL("file:E:/JAVA/Workspace/DesignPattern/sdp.jar")}, printer.getClass().getClassLoader());
		//Load Class using Reflection API
		Class<?> clss = classloader.loadClass("org.sahu.components.Printer7");
		//get access to getInstance() method
		Method method = clss.getDeclaredMethod("getInstance", new Class[] {});
		//invoke method
		Object obj = method.invoke(null);
		System.out.println(obj.getClass().getClassLoader());
		System.out.println(obj.hashCode());
	}
	
}
