package org.sahu.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.sahu.components.Printer4;

public class Singleton_DeSerialization {

	public static void main(String[] args) {
		try {
			//Write object data to file using ObjectInputStream support (Serialization process)
			ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("printer_data.ser"));
			Printer4 printer1 = (Printer4) ois1.readObject();
			printer1.print("Nimu");
			System.out.println("Printer object hashCode : "+printer1.hashCode());
			ois1.close();
			System.out.println("DeSerialization is done");
			System.out.println("------------------------------");
			ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("printer_data.ser"));
			Printer4 printer2 = (Printer4) ois2.readObject();
			printer2.print("Nimu");
			System.out.println("Printer object hashCode : "+printer2.hashCode());
			ois2.close();
			System.out.println("DeSerialization is done");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}