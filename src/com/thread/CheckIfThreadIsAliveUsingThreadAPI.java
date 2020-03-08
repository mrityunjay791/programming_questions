package com.thread;

public class CheckIfThreadIsAliveUsingThreadAPI {

	public static void main(final String[] args) throws InterruptedException {

		System.out.println("Thread main started");

		final Thread thread1 = new Thread(new MyTask());
		final Thread thread2 = new Thread(new MyTask());

		System.out.println("Thread1 is alive? " + thread1.isAlive());
		System.out.println("Thread2 is alive? " + thread2.isAlive());

		thread1.start();
		thread2.start();

		while (thread1.isAlive() || thread2.isAlive()) {
			System.out.println("Thread1 is alive? " + thread1.isAlive());
			System.out.println("Thread2 is alive? " + thread2.isAlive());
			Thread.sleep(100l);
		}

		System.out.println("Thread1 is alive? " + thread1.isAlive());
		System.out.println("Thread2 is alive? " + thread2.isAlive());

		System.out.println("Thread main finished");
	}
}

class MyTask implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] Message " + i);
			try {
				Thread.sleep(200);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}