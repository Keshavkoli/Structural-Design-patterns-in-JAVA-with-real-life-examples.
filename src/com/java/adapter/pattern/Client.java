package com.java.adapter.pattern;


//Client
public class Client {
	public static void main(String[] args) {
		Square square = new Square();
		Shape shape = new SquareAdapter(square);
		shape.draw();
	}
}
//Adapter Pattern: This pattern is used to convert the interface of a class into another interface that a client expects.
//For example, consider a scenario where you have a mobile phone charger with a USB port, but your laptop charger only has a three-pin plug.
//In such a case, you can use an adapter to convert the USB port into a three-pin plug.