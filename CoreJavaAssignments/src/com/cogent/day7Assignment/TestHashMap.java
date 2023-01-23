package com.cogent.day7Assignment;


public class TestHashMap {
	public static void main(String[] args) {
		
		StudentCollectionHashMap sc= new StudentCollectionHashMap();
		
		sc.setNames(1, new Student());
		sc.setNames(2, new Student());
		sc.setNames(3, new Student());
		
		sc.printNames();
		System.out.println("The student at index 2:");
		sc.getName(2);
		
		System.out.println("Removing Student at index 1");
		sc.remove(1);
		System.out.println("List of students after removal");
		sc.printSize();
		

	}
}
