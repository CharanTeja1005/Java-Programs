package com.example.charan;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {
	static List<Employee> employees = new ArrayList<Employee>();

	@BeforeClass
	public static  void beforeClass() {
		System.out.println("hey You are running before the class");		
	}

	@Before
	public  void setup() {
		System.out.println("hey You are running before the each test case");		
		employees.add(new Employee("Surya"));
		employees.add(new Employee("Niraj"));
		employees.add(new Employee("Charan"));
		employees.add(new Employee("Saran"));
		System.out.println(employees.size());
	}
	
	@After
	public  void tearDown() {
		System.out.println("hey You are running after each test case");		
		employees.clear();
		System.out.println(employees.size());
	};

	@AfterClass
	public  static void afterClass() {
		System.out.println("Bye you are running after the class");		
		
	}
	
	@Test
	public void testCheckEmployeeSize() {
		assertEquals(4, employees.size());
	}
	
	@Test
	public void testAddEmployee() {
		employees.add(new Employee("Rufiya"));
		System.out.println(employees.size());
		assertEquals(5, employees.size());
	}
	


	
}
