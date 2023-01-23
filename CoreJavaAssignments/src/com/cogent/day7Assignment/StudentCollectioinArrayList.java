package com.cogent.day7Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentCollectioinArrayList {
	
	
	private ArrayList<Student> names;

	
	public StudentCollectioinArrayList() {
		super();
		names= new ArrayList<Student>();
	}

	public StudentCollectioinArrayList(ArrayList<Student> names) {
		super();
		this.names = names;
	}

	public void setNames(ArrayList<Student> names) {
		this.names = names;
	}
	
	public void setNames(Student name) {
		this.names.add(name);
	}
	
	public void searchName(int index) {	
		if(index>names.size()) {
			System.out.println("Index is out of bounds");
		}
		System.out.println(names.get(index));		
	}
	

	public void printNames() {
		System.out.println(names);
	}
	
	public void removeName( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name you would like to search and remove");
		String name =sc.next();
		
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if(student.getName().equals(name)) {
				names.remove(student);
				System.out.println("Remove successfully");
				return;
			}
			
		}
		System.out.println("Remove unsuccessfully");
	}
}
