package com.exercise2.calculator_thi;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator cal = new Calculator();
	
	@Test
	public void testAddition() {
		double result = cal.addition(2.0, 2.0);
		assertEquals(result,4.0,0);
	}
	@Test
	public void testAddition2() {
		double result = cal.addition(2.0, 2.0);
		assertFalse(result != 4.0);
	}
	@Test
	public void testAddition3() {
		double result = cal.addition(2.0, 2.0);
		assertTrue(result == 4.0);
	}
	@Test
	public void testSubstraction() {
		double result = cal.substraction(2.0, 2.0);
		assertEquals(result,0.0,0);
	}
	@Test
	public void testSubstraction2() {
		double result = cal.substraction(2.0, 2.0);
		assertTrue(result == 0.0);
	}
	@Test
	public void testSubstraction3() {
		double result = cal.substraction(2.0, 2.0);
		assertFalse(result != 0.0);
	}
	@Test
	public void testMultiplication() {
		double result = cal.multiplication(2.0, 2.0);
		assertEquals(result,4.0,0);
	}
	@Test
	public void testMultiplication2() {
		double result = cal.multiplication(2.0, 2.0);
		assertTrue(result == 4.0);
	}
	@Test
	public void testMultiplication3() {
		double result = cal.multiplication(2.0, 2.0);
		assertFalse(result != 4.0);
	}
	@Test
	public void testDivision() {
		double result = cal.division(2.0, 2.0);
		assertEquals(result,1.0,0);
	}
	@Test
	public void testDivision2() {
		double result = cal.division(2.0, 2.0);
		assertTrue(result == 1.0);
	}
	@Test
	public void testDivision3() {
		double result = cal.division(2.0, 0.0);
		assertTrue(Double.isInfinite(result));
	}
	@Test
	public void testDivision4() {
		double result = cal.division(2.0, 2.0);
		assertFalse("wrong",result !=  1.0);
	}

}
