package com.main;

import com.classes.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator cals = new Calculator();
		System.out.println("Addition of 2 number: "+cals.addition(10,10));
		System.out.println("Substraction of 2 number: "+cals.substraction(10,10));
	}

}
