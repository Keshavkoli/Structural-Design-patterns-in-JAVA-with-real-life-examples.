package com.java.decorator.pattern;
//Concrete Component
public class PlainPizza implements Pizza {
	public String getDescription() {
		return "Plain Pizza";
	}

	public double getCost() {
		return 4.00;
	}
}
