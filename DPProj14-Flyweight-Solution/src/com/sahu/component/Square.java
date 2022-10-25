package com.sahu.component;

public class Square implements IShape {

	private String label;

	public Square() {
		System.out.println("Square.Square()");
		label = "SQUARE";
	}

	@Override
	public void draw(float side, String fillColor, String lineStyle) {
		System.out.println("Drawing "+label+" with side length "+side+" having fill color "+fillColor+", line style"+lineStyle);
	}

}
