package com.cogent.day09;

public class StringExample {
	public static void main(String[] args) {
		String s = "Hello World";

		System.out.println("Length of string is: "+ s.length());
		System.out.println("IndexOf l: " + s.indexOf("l"));
		System.out.println("charAt index 4: "+ s.charAt(4));
		System.out.println("substring with beginning index 5: " +s.substring(5));
		System.out.println("substring with beginning index 5 and ending index 7: " +s.substring(5,7));
		String[] s1= s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		System.out.println("toLowerCase: "+ s.toLowerCase());
		System.out.println("toUpperCase: "+ s.toUpperCase());
		System.out.println("replace H with t: " + s.replace('H', 't'));


		Employee emp = new Employee("Yurii", 100);
		System.out.println(emp);
		
		System.out.println(s);
		
		
		String s2 = "Hello";
		String s3 = "World";;
		
		System.out.println("Before concat method:\ns2:" + s2+ "\ns3:" + s3);
		s3=s2.concat(s3);
		System.out.println("Before concat method:\ns2:" + s2+ "\ns3:" + s3);

		test();		
	}
	
	static void test() {
		String s1 = "abc";//object created
		String s2 = "xyz";//object created
		String s3 = "abc";//object not created
		String s4 = new String("abc");//object not created
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1==s4);//false
		
		String s5 = "abcd";
		System.out.println(s5.hashCode());//object created
		s5=null;;
		String s6 = "abcd";
		System.out.println(s6.hashCode());//object created
		String s7 = new String("abc");
		System.out.println(s7==s4);//false

		
	}
}
