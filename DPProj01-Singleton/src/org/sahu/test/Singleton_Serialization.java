package org.sahu.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.sahu.components.Printer4;
import org.sahu.components.Printer7;

public class Singleton_Serialization {

	public static void main(String[] args) {
		//Get Singleton class object
		Printer4 printer = Printer4.getInstane();
		Printer7 printer2 = Printer7.getInstance();
		try {
			//Write object data to file using ObjectOutStream support (Serialization process)
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("printer_data.ser"));
			oos.writeObject(printer);
			oos.flush();
			oos.close();
			System.out.println("Serialization is done");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}