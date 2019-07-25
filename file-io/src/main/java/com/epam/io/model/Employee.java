package com.epam.io.model;

import java.io.Serializable;

public class Employee implements Serializable {	
	private static final long serialVersionUID = -7485631845878177501L;
	private int empId;
	private String name;
	private long salary;
	private transient int age;
	private static String company;
	
	public Employee(int empId, String name, long salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		company ="epam";
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", age=" + age + " company="+company+"]";
	}
	
}
