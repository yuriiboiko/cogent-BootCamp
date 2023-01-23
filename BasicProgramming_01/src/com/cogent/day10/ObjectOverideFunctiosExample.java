package com.cogent.day10;

public class ObjectOverideFunctiosExample {
	
	public static void main(String[] args) {
		Person p1= new Person("Yurii",20);
		Person p2= new Person("Yurii",20);

		System.out.println(p1);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println("\n");

		Rectangle r1 =  new Rectangle(10,5);
		Rectangle r2 =  new Rectangle(10,5);
		Rectangle r3 =  new Rectangle(10,6);

		Book b1 = new Book("Hello java", "Yurii Boiko", 3, 29.99);		
		Book b2 = new Book("Hello java", "Yurii Boiko", 3, 29.99);
		Book b3 = new Book("Hello java v2", "Yurii Boiko", 3, 29.99);
		
		
		System.out.println("b1 toString method: "+ b1.toString());
		System.out.println("b2 toString method: "+ b2.toString());
		System.out.println("Comapring b1 and b2: "+ b1.equals(b2));
		System.out.println("-------------------------------------");
		System.out.println("b1 toString method: "+ b1.toString());
		System.out.println("b3 toString method: "+ b3.toString());
		System.out.println("Comapring b1 and b2: "+ b1.equals(b3));
		
		System.out.println("\n");
		
		System.out.println("r1 toString method: "+ r1.toString());
		System.out.println("r2 toString method: "+ r2.toString());
		System.out.println("Comapring r1 and r2: "+ r1.equals(r2));
		System.out.println("-------------------------------------");
		System.out.println("r1 toString method: "+ r1.toString());
		System.out.println("r3 toString method: "+ r3.toString());
		System.out.println("Comapring r1 and r2: "+ r1.equals(r3));
	}

}
