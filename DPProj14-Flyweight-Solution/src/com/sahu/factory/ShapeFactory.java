 package com.sahu.factory;

import java.util.HashMap;
import java.util.Map;

import com.sahu.component.Circle;
import com.sahu.component.IShape;
import com.sahu.component.Square;

public class ShapeFactory {
	
	private static Map<ShapeType, IShape> cacheMap = new HashMap<>();
	
	public static IShape getShape(ShapeType shapeType) {
		IShape shape = null;
		if (!cacheMap.containsKey(shapeType)) {
			if (shapeType.equals(ShapeType.SQUARE))
				shape = new Square();
			else if (shapeType.equals(ShapeType.CIRCLE))
				shape = new Circle();
			
			//Keep shape object in cache
			cacheMap.put(shapeType, shape);
		}
		shape = cacheMap.get(shapeType);
		
		return shape;
	}
	
}
