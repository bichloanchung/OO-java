package com.exerciseOOPwMaven.classroom_managements;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ClassroomTest {
	ArrayList<Student> std = new ArrayList<Student>();
	Classroom cl = new Classroom("MT", "Spring 2021", std);
	
	@Test
	public void testAddANS() {
		int x = std.size();
		System.out.println(x);
		Student std1 = new Student(7,"Meo","Jhs",'M',7.0,8.0,9.0,0.0);
		cl.addANewStudent(std1);
		int y = std.size();
		System.out.println(y);
		assertTrue(x < y);	
	}
	@Test
	public void testRemoveAS() {
		String firstName = "Ti";
		boolean removeE = true;
		for (int i = 0; i < std.size(); i++) {
			if (std.contains(firstName)) {
				//return true;
			}//else return false;
		}
		assertTrue(!std.contains("Ti"));
	}

}
