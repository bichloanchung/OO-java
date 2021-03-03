package com.exercise._abstract_class;

public class male extends person{
	private static final String CLASS_NAME = "male";
	
	public male(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printClassName() {
		System.out.println("The person "+name+" belongs to class: "+CLASS_NAME);
	}

}
