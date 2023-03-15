package com.java.decorator.pattern;

//Concrete Decorators
public class Cheese extends ToppingDecorator {
	public Cheese(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
	}

	public double getCost() {
		return pizza.getCost() + 0.50;
	}
}
