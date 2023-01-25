package com.cogent.thread;

import java.util.Scanner;

public class JoinDemoCircle extends Thread{

	static int r;
	static double area;
	public static void main(String[] args) {

		long start =System.currentTimeMillis();
		System.out.println("Calculate area of circle with the radius values r!");
		System.out.println("Enter an r value...");
		Scanner sc = new Scanner(System.in);
		JoinDemoCircle.r=sc.nextInt();
		System.out.println("Radius value you've entered is: " + JoinDemoCircle.r + ".");

		JoinDemoCircle jd = new JoinDemoCircle();
		jd.start();

		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Area of circle with radius " + JoinDemoCircle.r + " is equal to: " + JoinDemoCircle.area + ".");
		long end = System.currentTimeMillis();
		System.out.println("This program took " + (end- start)/1000 + " seconds." );


		sc.close();

	}

	@Override
	public void run() {
		JoinDemoCircle.area = Math.PI * JoinDemoCircle.r*JoinDemoCircle.r;

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}

}
