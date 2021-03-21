package com.exercise2.calculator_thi;

public class Main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double x = cal.addition(2.0, 2.0);
		double y = cal.substraction(3.0, 2.0);
		double z = cal.multiplication(2.0, 1.5);
		double w = cal.division(2.0, 0.0);
		System.out.println("Sum of two double values: "+x);
		System.out.println("Substraction of two double values: "+y);
		System.out.println("Multiplication of two double values: "+z);
		System.out.println("Division of two double values: "+w);
	}

}
