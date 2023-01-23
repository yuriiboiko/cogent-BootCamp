package com.cogent.day7Assignment;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		StudentCollectioinArrayList s= new StudentCollectioinArrayList();
		s.setNames(new Student());
		s.setNames(new Student());
		System.out.println("At index 2 we have:");
		s.searchName(1);
		
		s.printNames();
		s.removeName();
		System.out.println("List after removal:");
		s.printNames();
	}
}
