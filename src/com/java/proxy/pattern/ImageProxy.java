package com.java.proxy.pattern;

//Proxy
public class ImageProxy implements Image {
	private RealImage realImage;
	private String filename;

	public ImageProxy(RealImage realImage, String filename) {
		this.realImage = realImage;
		this.filename = filename;
	}

	public ImageProxy(String filename) {
		super();
		this.filename = filename;
	}

	public void display() {
		if (realImage == null) {
			realImage = new RealImage(filename);
		}
		realImage.display();
	}

}
