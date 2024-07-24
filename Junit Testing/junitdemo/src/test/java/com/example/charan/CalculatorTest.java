package com.example.charan;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CalculatorTest {
	
	Calculator calculator;

	// execute before class
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}

	// execute after class
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}

	// execute before test
	@Before
	public void beforeEachTest() {
		System.out.println("in before");
		calculator = new Calculator();
		
	}

	// execute after test
	@After
	public void afterEachTest() {
		System.out.println("in after");
	}

	// test case
	@Test
	public void test() {
		System.out.println("in test");
	}

	// test case ignore and will not execute
	@Ignore
	public void ignoreTest() {
		System.out.println("in ignore test");
	}
	
	@Test
	public void testAdd() {
		int result = calculator.add(10, 20);
		assertEquals(30, result);
	}
	
	@Test
	public void testSub() {
		int result = calculator.sub(10, 20);
		assertEquals(result,-10);
	}
	
	@Test
	public void testMul() {
		int result = calculator.mul(10, 20);
		assertEquals(200, result);
	}
	
	@Test
	public void testDiv() {
		int result = calculator.div(20, 10);
		assertEquals(2, result);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDiv_Exception() {
		int result = calculator.div(1, 0);
	}
}
