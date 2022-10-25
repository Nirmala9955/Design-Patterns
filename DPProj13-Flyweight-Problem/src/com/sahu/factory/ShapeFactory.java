package com.sahu.factory;

import com.sahu.component.Circle;
import com.sahu.component.IShape;
import com.sahu.component.Square;

public class ShapeFactory {
	
	public static IShape getShape(ShapeType shapeType) {
		IShape shape = null;
		if (shapeType.equals(ShapeType.SQUARE))
			shape = new Square();
		else if (shapeType.equals(ShapeType.CIRCLE))
			shape = new Circle();
			
		return shape;
	}
	
}
