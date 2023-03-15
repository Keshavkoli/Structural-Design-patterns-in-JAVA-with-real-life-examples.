package com.java.bridge.pattern;

//Refined Abstraction
public class Circle extends Shape {
	public Circle(Color color) {
		super(color);
	}

	public void draw() {
		System.out.print("Drawing Circle with ");
		color.applyColor();
	}
}
