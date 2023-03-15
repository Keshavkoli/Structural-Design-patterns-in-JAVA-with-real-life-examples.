package com.java.decorator.pattern;
//Decorator
public abstract class ToppingDecorator {
	protected Pizza pizza;

	public ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription();
	}

	public double getCost() {
		return pizza.getCost();
	}
}
