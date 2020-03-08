package com.thread;

public class InstantiateUsingRunnable {

	public static void main(String[] args) {
        System.out.println("Thread main started");

		final Thread th = new Thread(new WorkerThread("This is my first thread example..!"));
		
		th.start();
		
		th.setName("MrityunjayThread1");
		
		System.out.println("Main Thread Finished..");
	}

}
