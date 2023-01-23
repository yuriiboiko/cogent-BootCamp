package com.cogent.day7Assignment;

import java.util.HashMap;
import java.util.Set;

public class StudentCollectionHashMap {
	
	
	private HashMap<Integer,Student> empNames;
	
	public StudentCollectionHashMap() {
		super();
		empNames = new HashMap<Integer, Student>();
	}

	public StudentCollectionHashMap(HashMap<Integer, Student> empNames) {
		super();
		this.empNames = empNames;
	}
	
	public void setNames(HashMap<Integer, Student> empNames) {
		this.empNames.putAll(empNames);
	}
	
	public void setNames(Integer key, Student name) {
		this.empNames.put(key, name);
	}
	
	public void printNames(){
		for(Integer i : empNames.keySet()) {
			System.out.print(empNames.get(i) + " ");
		}
	}
	
	public void getName( Integer key) {
		System.out.println(empNames.get(key));
	}
	
	
	public void printNamesKeySet(Set<Integer> keys ) {
		for(Integer i : keys) {
			System.out.print(i + " ");
		}
	}
	
	public void printSize( ) {
		System.out.println("The size of collection is: " + empNames.size() );
	}
	
	public void remove( Integer key) {
		empNames.remove(key);
	}
}
