package com.cogent.day7Assignment;

import java.util.Scanner;

public class Student {
	private String name;
	private int rollNo;
	private int age;
	private String address;

	public Student(int rollNo, int age, String address, String name) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.address = address;
		this.name = name;
	}

	public Student() {
		super();
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter student name");
		this.name = sc.next();
		System.out.println("Please enter student roll number");
		this.rollNo = sc.nextInt();
		System.out.println("Please enter student age");
		this.age = sc.nextInt();
		System.out.println("Please enter student address");
        sc.nextLine();

		this.address = sc.nextLine();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", rollNo=" + rollNo + ", age=" + age + ", address=" + address + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	
	
	
}
