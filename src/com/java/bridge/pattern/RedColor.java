package com.java.bridge.pattern;

//Concrete Implementors
public class RedColor implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying Red Color");
	}

}
