package com.example.charan;

public class Employee {
	
	private String name;
	
	

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public Employee(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployee() {
		
		return "Hello";
	}
	
	public String getDepartment() {
		
		return "Bye";
	}
}
