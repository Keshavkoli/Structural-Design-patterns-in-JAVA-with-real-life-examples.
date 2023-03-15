package com.java.bridge.pattern;

//Refined Abstraction
public class Square extends Shape {
	public Square(Color color) {
		super(color);
	}

	public void draw() {
		System.out.print("Drawing Square with ");
		color.applyColor();
	}
}
