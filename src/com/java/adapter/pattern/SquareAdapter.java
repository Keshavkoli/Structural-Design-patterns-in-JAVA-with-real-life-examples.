package com.java.adapter.pattern;

//Adapter
//Allows objects with incompatible interface and collaborate
public class SquareAdapter implements Shape {

	private Square square;

	public SquareAdapter(Square square) {
		this.square = square;
	}

	@Override
	public void draw() {
		square.drawSquare();
	}

}
