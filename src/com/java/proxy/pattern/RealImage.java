package com.java.proxy.pattern;

//Real Subject
public class RealImage implements Image {
	private String filename;

	public RealImage(String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}

	public void display() {
		System.out.println("Displaying " + filename);
	}

	private void loadImageFromDisk() {
		System.out.println("Loading " + filename + " from disk");
	}
}
