package com.thread;

public class ThreadExampleUsingThreadClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Creating Thread...!");
		WorkedThreadExtendingThread w =  new WorkedThreadExtendingThread("Thread 1.", 2000l);
		WorkedThreadExtendingThread w2 =  new WorkedThreadExtendingThread("Thread 2.", 1000l);
		WorkedThreadExtendingThread w3 =  new WorkedThreadExtendingThread("Thread 3.", 500l);
		WorkedThreadExtendingThread w4 =  new WorkedThreadExtendingThread("Thread 3.", 1500l);
		
		w.start();
		w2.start();
		w3.start();
		w4.start();
		
		System.out.println("Waiting for Thread-1 to complete: ");
		w.join();
		System.out.println("Thread-1 Ended..");
		
		
		
		
		System.out.println("Main thread ended..!");
		
		
	}

}
