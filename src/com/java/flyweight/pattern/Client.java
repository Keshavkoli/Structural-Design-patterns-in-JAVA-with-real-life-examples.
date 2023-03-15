package com.java.flyweight.pattern;

import java.awt.Color;

public class Client {
	private static final Color[] colors = { Color.RED, Color.GREEN, Color.BLUE };

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.draw();
		}
	}

	private static Color getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}
}
//Flyweight Pattern: This pattern allows you to share objects to reduce memory usage. 
//For example, consider a scenario where you have a large number of identical objects that take up a lot of memory.
//You can use the flyweight pattern to share these objects and reduce the overall memory usage.