package com.exerciseOOPwMaven.classroom_managements;

import java.util.ArrayList;
import java.util.Collections;

public class Classroom{
	private String classroomName = "PSHTLH20";
	private String classroomTerm = "Spring 2021";
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Classroom(String classroomName, String classroomTerm, ArrayList<Student> students) {
		this.classroomName = classroomName;
		this.classroomTerm = classroomTerm;
		this.students = students;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}
	
	public void setClassroomTerm(String classroomTerm) {
		this.classroomTerm = classroomTerm;
	}
	
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public String getClassroomName() {
		return classroomName;
	}

	public String getClassroomTerm() {
		return classroomTerm;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public void addANewStudent(Student student) {
		students.add(student);
	}
	
	public String removeAStudent(String firstName) {
		boolean isRemove = false;
		for (int i = 0; i < students.size(); i++) {
			Student std = students.get(i);
			if (std.getFirstName().equals(firstName)) {
				isRemove = students.remove(std);
				break;
			 }
		}
		if (isRemove==true)
			return "Student " + firstName + " successfully removed";
		else
			return "The student doesnt exist";
		
	}
	public void printFullRelatory(){
	  	System.out.println("Classroom: "+classroomName);
	   	System.out.println("Term: "+classroomTerm);
	   	for(int i = 0; i < students.size(); i++){
	   		System.out.println(students.get(i).toString());
	  }
	}
}
	 /*public String printFullRelatory() {
		 return "Class: " + getClassroomName() + ", Term: " + getClassroomTerm() + " have : \n" + getStudents();
	 }*///andra satt att utskriva hela relatory
	   
	 
	 /*public void removeASt(String firstName) {
		 int counter = 0;
		 boolean stdExist = false;
		 int indexToBeRemoved = -1;
		 while((counter < students.size()) && (stdExist == false)) {
			 if (students.get(counter).getFirstName().equals(firstName)) {
				 stdExist = true;
				 indexToBeRemoved = counter;
			 }
			 counter ++; 
		 }
		 if(stdExist) {
			 students.remove(indexToBeRemoved);
			 System.out.println("Student "+firstName+" successfully removed");
		 }else {
			 System.out.println("The student doesnt exist");
		 }
	 }*/
	
	

