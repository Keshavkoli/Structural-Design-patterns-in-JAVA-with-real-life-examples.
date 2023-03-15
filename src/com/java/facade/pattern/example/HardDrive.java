package com.java.facade.pattern.example;

public class HardDrive {
	public byte[] read(long lba, int size) {
		System.out.println("Hard Drive is reading " + size + " bytes from LBA " + lba + "...");
		return new byte[size];
	}
}
