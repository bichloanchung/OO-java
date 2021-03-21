package com.exerciseOOPwMaven.classroom_managements;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> arrStd = new ArrayList<Student>();
		Classroom cl = new Classroom("MT","Spring 2021",arrStd);
		Student std1 = new Student(10,"Ti","Nguyen",'M',9.0,9.0,9.0,0.0);
		Student std2 = new Student(7,"Suu","Tran",'F',8.0,9.0,8.0,0.0);
		Student std3 = new Student(9,"Dan","Nguyen",'M',7.0,8.0,9.0,0.0);
		
		cl.addANewStudent(std1);
		cl.addANewStudent(std2);
		cl.addANewStudent(std3);
		
		//System.out.println(cl.printFullRelatory());
		
		String x = cl.removeAStudent("Dan");
		//System.out.println(x);
		
		cl.printFullRelatory();
		
	}

}
