package com.classes;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	
	public Calculator(int a, int b){
		this.firstNumber = a;
		this.secondNumber = b;
	}
	
	public void setFirstNumber(int a) {
		this.firstNumber = a;
	}
	public void setSecondNumber(int b) {
		this.secondNumber = b;
	}
	public int getFirstNumber(){
		return firstNumber;
	}
	public int getSecondNumber(){
		return secondNumber;
	}
	
	public int addition() {
		return this.firstNumber + this.secondNumber;
	}
	public int substraction() {
		return this.firstNumber - this.secondNumber;
	}
}
