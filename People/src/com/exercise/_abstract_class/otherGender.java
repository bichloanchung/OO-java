package com.exercise._abstract_class;

public class otherGender extends person {
	public static final String CLASS_NAME = "Other gender";
	
	public otherGender(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printClassName() {
		System.out.println("The person "+name+" belongs to class: "+CLASS_NAME);
	}

}
