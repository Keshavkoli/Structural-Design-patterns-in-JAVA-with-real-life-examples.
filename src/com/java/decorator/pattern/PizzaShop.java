package com.java.decorator.pattern;

//Client
public class PizzaShop {
	public static void main(String[] args) {
		Pizza pizza = new PlainPizza();
		System.out.println("Order: " + pizza.getDescription() + ", Cost: $" + pizza.getCost());

		pizza = (Pizza) new Cheese(pizza);
		System.out.println("Order: " + pizza.getDescription() + ", Cost: $" + pizza.getCost());

		pizza = (Pizza) new Pepperoni(pizza);
		System.out.println("Order: " + pizza.getDescription() + ", Cost: $" + pizza.getCost());
	}
}
