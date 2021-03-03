package com.exercise._abstract_class;

public class female extends person{
	public static final String CLASS_NAME = "female";
	
	public female(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printClassName() {
		System.out.println("The person "+name+" belongs to class: "+CLASS_NAME);
	}

}
