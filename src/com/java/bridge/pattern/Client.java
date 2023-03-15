package com.java.bridge.pattern;

//Bridge
public class Client {
	public static void main(String[] args) {
		Color redColor = new RedColor();
		Shape circle = new Circle(redColor);
		circle.draw();

		Color blueColor = new BlueColor();
		Shape square = new Square(blueColor);
		square.draw();
	}
}

//lets you split a large class or a set of closely related classes into two separate hierarchies - abstraction and
//implementation - which can be developed independently of each other.

//Bridge Pattern: This pattern separates an object’s interface from its implementation. 
//For example, consider a scenario where you want to develop a messaging app that works on both Android and iOS devices.
//Instead of writing two separate apps, you can create a bridge that connects the messaging app interface to the specific platform’s implementation.