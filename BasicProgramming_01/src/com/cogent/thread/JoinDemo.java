package com.cogent.thread;

import java.util.Scanner;

public class JoinDemo extends Thread{

	static int sum,n;
	public static void main(String[] args) {

		long start =System.currentTimeMillis();
		System.out.println("Sum of the N values");
		System.out.println("Enter a N value");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n=sc.nextInt();

		JoinDemo jd = new JoinDemo();
		jd.start();
		
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of " + JoinDemo.n + " numbers is equal to: " + JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("This program took " + (end- start)/1000 + " seconds." );




	}

	@Override
	public void run() {
		
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum+=i;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
