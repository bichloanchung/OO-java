package com.exercise._abstract_class;
/*
 * Exercise 16_06
 */
public class main {

	public static void main(String[] args) {
		male m = new male("Rafael", 30);
		female f = new female("Raquel", 25);
		otherGender otG = new otherGender("Louis", 20);
		
		m.printClassName();
		f.printClassName();
		otG.printClassName();

	}

}
