package com.java.decorator.pattern;

public class Pepperoni extends ToppingDecorator {

	public Pepperoni(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return pizza.getDescription() + ", Pepperoni";
	}

	public double getCost() {
		return pizza.getCost() + 1.00;
	}
}
