package com.exerciseOOPwMaven.classroom_managements;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ClassroomTest {
	
	@Test
	public void testAddANS() {
		ArrayList<Student> std = new ArrayList<Student>();
		Classroom cl = new Classroom("MT", "Spring 2021", std);
		int x = std.size();
		//System.out.println(x);
		Student std1 = new Student(7,"Meo","Jhs",'M',7.0,8.0,9.0,0.0);
		cl.addANewStudent(std1);
		int y = std.size();
		//System.out.println(y);
		assertTrue(x < y);	
	}
	
	@Test
	public void testRemoveAS() {
		ArrayList<Student> std = new ArrayList<Student>();
		Classroom cl = new Classroom("MT", "Spring 2021", std);
		int x = std.size();
		//System.out.println(x);
		Student std1 = new Student(7,"Meo","Jhs",'M',7.0,8.0,9.0,0.0);
		cl.addANewStudent(std1);
		String firstName = "Meo";
		cl.removeAStudent(firstName);
		ArrayList<Student> std2 = cl.getStudents();
		// check if std2 contains "Meo"
		for (int i = 0; i < std2.size(); i++) {
			if (std2.get(i).getFirstName().equals("Meo")) {
				assertFalse(true);
			}
		}
	}

}
