package com.cogent.day7Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortDemo {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Using Comparable interface:");
		List<Student> s = new  ArrayList<Student>();
		
		for (int i = 0; i <5; i++) {
			s.add(new Student());
		}
		
		////Quick way to test
		//s.add(new Student(123,20,"usa", "Bob"));
		//s.add(new Student(456,30,"canada","Alex"));
		//s.add(new Student(789,55,"mexico","Zach"));
		//s.add(new Student(741,22,"Italy","Kevin"));

		
		
		System.out.println("Array list before sort:");
		
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		
	
	
		Collections.sort(s);
		
		System.out.println("Array list after sort:");
		
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Using Comparator interface:");

		List<Student> s1 = new  ArrayList<Student>();
		for (int i = 0; i <5; i++) {
			s1.add(new Student());
		}
		
		////quick way to test
		//s1.add(new Student(123,20,"usa", "Bob"));
		//s1.add(new Student(456,30,"canada","Alex"));
		//s1.add(new Student(789,55,"mexico","Zach"));
		//s1.add(new Student(741,22,"Italy","Kevin"));

		System.out.println("Array list before sort:");
		
		for (int i = 0; i < s1.size(); i++) {
			System.out.println(s1.get(i));
		}
		
		Collections.sort(s1, new StudentImplementsComparator() );
		
		System.out.println("Array list after sort:");
		
		for (int i = 0; i < s1.size(); i++) {
			System.out.println(s1.get(i));
		}
	
	}

}
