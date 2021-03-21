package com.exerciseOOPwMaven.classroom_managements;

import java.text.DecimalFormat;

public class Student extends Person{
	private double firstGrade = 9.0;
	private double secondGrade = 9.0;
	private double thirdGrade = 9.0;
	private double averageGrade = 9.0;

	public Student(int age, String firstName, String lastName, char gender) {
		super(age, firstName, lastName, gender);
	}

	public Student(int age, String firstName, String lastName, char gender, double firstGrade, double secondGrade,
			double thirdGrade, double averageGrade) {
		super(age, firstName, lastName, gender);
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;
		this.averageGrade = averageGrade;
	}
	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}
	public void setSencondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}
	public void setThirdGrade(double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}
	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
	public double getFirstGrade() {
		return this.firstGrade;
	}
	public double getSecondGrade() {
		return this.secondGrade;
	}
	public double getThirdGrade() {
		return this.thirdGrade;
	}
	public double getAverageGrade() {
		return this.averageGrade;
	}
	public double calculateAverage() {
		double avr = (firstGrade + secondGrade + thirdGrade)/3;
		setAverageGrade(avr);
		return avr;
	}
	public double calculateAverage(double firstGrade, double secondGrade, double thirdGrade) {
		double avr = (firstGrade + secondGrade + thirdGrade)/3;
		setAverageGrade(avr);
		return avr;
	}
	public boolean hasClearTheCourse() {
		if (getAverageGrade() < 6.0) {
			//System.out.println("The student has not cleared the course!");
			return false;
		}
		return true;
	}
	public String toString() {
		calculateAverage(this.getFirstGrade(), this.getSecondGrade(), this.getThirdGrade());
		DecimalFormat df = new DecimalFormat("#.0");
		
		if(hasClearTheCourse()) {
			return "Student: "+getFirstName()+ " "+ getLastName()+"\n"+"Grades: "+ this.firstGrade + "," + this.secondGrade + ","
					+ this.thirdGrade + "\nFinalGrade: " + df.format(this.averageGrade)
					+ "\nThe student has cleard the course\n-----------\n";
		}else
			return "Student: "+getFirstName()+ " "+ getLastName()+"\n"+"Grades: "+ this.firstGrade + "," + this.secondGrade + ","
			+ this.thirdGrade + "\nFinalGrade: " + df.format(this.averageGrade)
			+ "\nThe student has not cleard the course\n-----------\n";
	}
	
	
}
