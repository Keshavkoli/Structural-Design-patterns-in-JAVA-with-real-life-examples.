package com.java.flyweight.pattern;

import java.awt.Color;
import java.util.HashMap;

//Flyweight Factory
public class ShapeFactory {
	private static final HashMap<Color, Shape> circleMap = new HashMap<Color, Shape>();

	public static Shape getCircle(Color color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
		}

		return circle;
	}
}
