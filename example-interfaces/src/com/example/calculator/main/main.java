package com.example.calculator.main;

import com.example.calculator.classes.ScientificCalculator;
import com.example.calculator.classes.SimpleCalculator;
/*
 * Exercise 2 interfaces
 */
public class main {

	public static void main(String[] args) {
		SimpleCalculator simpleCalc = new SimpleCalculator();
		System.out.println(simpleCalc.addition(2.0, 2.0));
		System.out.println(simpleCalc.substraction(2.0, 2.0));

		ScientificCalculator scientificCalculator = new ScientificCalculator();
		System.out.println(scientificCalculator.square(3.0));
	}

}
