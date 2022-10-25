package com.sahu.test;

import com.sahu.component.IShape;
import com.sahu.factory.ShapeFactory;
import com.sahu.factory.ShapeType;

public class FlyWeightDPTest {

	public static void main(String[] args) {
		for (int i=1; i <=500; i++) {			
			IShape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
			shape.draw(i+10, "Red", "Dotted");
		}
		System.out.println("--------------------");
		for (int i=1; i <=500; i++) {			
			IShape shape = ShapeFactory.getShape(ShapeType.SQUARE);
			shape.draw(i+10, "Red", "Dotted");
		}
	}
	
}
