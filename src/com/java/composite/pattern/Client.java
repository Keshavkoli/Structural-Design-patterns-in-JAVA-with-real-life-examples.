package com.java.composite.pattern;

//Client
public class Client {
	public static void main(String[] args) {
		Developer developer1 = new Developer("John", "Developer");
		Developer developer2 = new Developer("Mary", "Developer");

		Manager manager1 = new Manager("Mike", "Manager");
		Manager manager2 = new Manager("Sara", "Manager");

		CompanyDirectory directory1 = new CompanyDirectory();
		directory1.addEmployee(developer1);
		directory1.addEmployee(manager1);

		CompanyDirectory directory2 = new CompanyDirectory();
		directory2.addEmployee(developer2);
		directory2.addEmployee(manager2);

		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(directory1);
		directory.addEmployee(directory2);

		directory.showEmployeeDetails();
	}
}

//Composite Pattern: This pattern allows you to treat a group of objects in the same way as a single object. 
//For example, consider a scenario where you have a tree structure of files and folders on your computer.
//You can treat each file and folder as an individual object, but also treat the entire tree structure as a single object.