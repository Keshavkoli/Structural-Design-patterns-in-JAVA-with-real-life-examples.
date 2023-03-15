package com.java.facade.pattern.example;

public class Client {
	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.start();
	}
}
