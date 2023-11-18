package com.upskill.java_6;

public class MultiThreading {
	
	/*Multithreading is a Java feature that allows  concurrent execution of two or more parts of a program.
	
	Threads can be created buy using two mechanisms :
	
	1. Extending the thread class
	2. Implementing the Runnable interface */
	

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++){
			MultiThreadingThread obj = new MultiThreadingThread();
			obj.start();
			
			Thread obj2 = new Thread(new MultiThreadingRunnable());
			obj2.start();
		}
		

	}

}
