package com.example.calculator.classes;

import com.example.calculator.interfaces.AdvancedMathOperations;

public class ScientificCalculator extends SimpleCalculator implements AdvancedMathOperations {
	public double square(double number) {
		double result = number * number;
		return result;
	}

	public double raisedToThePowerOf(double base, double exponent) {
		double result = Math.pow(base, exponent);
		return result;
	}

	public double remainder(double dividend, double divisor) {
		double result = dividend % divisor;
		return result;
	}
	
	

}
