package com.cogent.thread;

public class ChildThreadYield extends Thread{

	@Override
	public void run() {

		for (int i = 1; i < 25; i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.yield();

		}
	}
}
