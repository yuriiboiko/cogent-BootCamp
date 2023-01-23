package com.cogent.day1.q5;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1231,"Yurii",new Date(1,12,1995));
		Employee emp2 = new Employee(1781,"Jack",new Date(3,25,123456));
		Employee emp3 = new Employee(1231,"Yurii",new Date(8,12, -2010));
		Employee emp4 = new Employee(1231,"Yurii",new Date(2,29,2003));
		Employee emp5 = new Employee(1231,"Yurii",new Date(2,29,2004));
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);

		
	}

}
