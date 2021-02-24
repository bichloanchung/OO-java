package com.main;

import com.classes.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator cals = new Calculator(10,10);
		int x = cals.addition();
		int y = cals.substraction();
		System.out.println("Addition of 2 number is : "+x);
		System.out.println("Substraction of 2 number is : "+y);

	}

}
