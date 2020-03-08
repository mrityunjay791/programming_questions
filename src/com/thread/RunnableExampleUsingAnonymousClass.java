package com.thread;

public class RunnableExampleUsingAnonymousClass {

	public static void main(String[] args) {
		
		System.out.println("Anonymous Runnable..");
		
		final Runnable r = new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 5; i ++) {
					System.out.println(Thread.currentThread().getName() +" "+ i);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		};
		
		
		final Runnable r2 = () -> {
			
			for(int i = 0; i < 5; i ++) {
				System.out.println(Thread.currentThread().getName() +" "+ i);
				try {
					Thread.sleep(1000);
		            Thread.sleep(1000, 500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
		};
		System.out.println("Creating Thread..");
		Thread th = new Thread(r2);
		Thread th2 = new Thread(r2);
		
		System.out.println("Starting thread..!");
		th.setName("Thread1");
		th.start();
		System.out.println("Starting thread2..!");
		th2.setName("Thread2");
		th2.start();
		
		System.out.println("Main thread finished..");
	}

}
