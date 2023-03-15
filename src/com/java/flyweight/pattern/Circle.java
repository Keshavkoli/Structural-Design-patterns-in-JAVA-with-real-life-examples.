package com.java.flyweight.pattern;

import java.awt.Color;

//Concrete Flyweight
public class Circle implements Shape {
	private Color color;
	// above private Color variable is imported from java.awt.Color package

	public Circle(Color color) {
		this.color = color;
		System.out.println("Creating circle with color " + color);
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle with color " + color);
	}

}
