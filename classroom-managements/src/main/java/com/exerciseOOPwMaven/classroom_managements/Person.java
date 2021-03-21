package com.exerciseOOPwMaven.classroom_managements;

public class Person {
	private int age = 29;
	private String firstName = "Thi";
	private String lastName = "Chung";
	private char gender = 'F';
	
	public Person(int age, String firstName, String lastName, char gender) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}

}
