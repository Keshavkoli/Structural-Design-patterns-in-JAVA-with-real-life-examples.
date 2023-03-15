package com.java.facade.pattern.example;

public class Memory {
	public void load(long position, byte[] data) {
		System.out.println("Memory is loading data at position " + position + "...");
	}
}
