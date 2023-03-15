package com.java.composite.pattern;

import java.util.ArrayList;
import java.util.List;

//Composite
public class CompanyDirectory implements Employee {
	private List<Employee> employeeList = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employeeList.remove(employee);
	}

	@Override
	public void showEmployeeDetails() {
		for (Employee employee : employeeList) {
			employee.showEmployeeDetails();
		}
	}
}
