package com.example.charan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathsTest {
	
	
	
 @Test
  public void testGetCalculate_Add() {
	  Maths maths = new Maths();
	 assertEquals(4, maths.getCalculate(2, 2, "add"));
  }
 
 @Test
 public void testGetCalculate_Sub() {
	  Maths maths = new Maths();
	 assertEquals(0, maths.getCalculate(2, 2, "sub"));
 }

}
