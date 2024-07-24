package com.example.charan;

public class Maths {

	public int getCalculate(int a, int b, String operation) {

		if (operation.equals("add")) {
			return a + b;
		} else if (operation.equals("sub")) {
			return a - b;
		} else if (operation.equals("mul")) {
			return a * b;
		} else
			return a / b;

	}

}
