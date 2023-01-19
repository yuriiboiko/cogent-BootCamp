package com.cogent.day09;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("default capacity: " + sb.capacity());
		sb.append("A very important message");
		sb.append(" needs to be written here");
		
		//capacity incresed by this (oldCapacity*2)+2
		System.out.println("new capacity: " + sb.capacity());
		
		System.out.println("charAt: "+ sb.charAt(10));
		StringBuffer sb1 = new StringBuffer("abcde");
		
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.insert(4,"xyz"));
		
		System.out.println(sb1.delete(3, 5));
				
	}

}
