package com.sahu.component;

public class Circle implements IShape {

	private String label;

	public Circle() {
		System.out.println("Circle.Circle()");
		label = "CIRCLE";
	}

	@Override
	public void draw(float radius, String fillColor, String lineStyle) {
		System.out.println("Drawing "+label+" with radius "+radius+" having fill color "+fillColor+", line style"+lineStyle);
	}

}
