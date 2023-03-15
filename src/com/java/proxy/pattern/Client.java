package com.java.proxy.pattern;

//Client
public class Client {
	public static void main(String[] args) {
		Image image = new ImageProxy("test.jpg");
		image.display();
	}
}

//Proxy Pattern: This pattern provides a placeholder for an object to control its access. 
//For example, consider a scenario where you want to access a database, but you don’t want everyone to have access to it. 
//In such a case, you can use a proxy to control who can access the database and what they can do with it.