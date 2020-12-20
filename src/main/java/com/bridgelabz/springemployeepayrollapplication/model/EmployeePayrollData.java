package com.bridgelabz.springemployeepayrollapplication.model;

public class EmployeePayrollData {

	public String name;
	public long salary;

	public EmployeePayrollData(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData [name=" + name + ", salary=" + salary + "]";
	}

}
