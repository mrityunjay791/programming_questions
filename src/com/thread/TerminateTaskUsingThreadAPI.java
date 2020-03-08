package com.thread;

public class TerminateTaskUsingThreadAPI {

	public static void main(final String[] args) {

		System.out.println("Thread main started");

		final Task task = new Task();
		final Thread thread = new Thread(task);
		thread.start();

		thread.interrupt();

		System.out.println("Thread main finished");
	}
}

class Task implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] Message " + i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			if (Thread.interrupted()) {
				System.out.println("This thread was interruped by someone calling this Thread.interrupt()");
				System.out.println("Cancelling task running in thread " + Thread.currentThread().getName());
				System.out.println(
						"After Thread.interrupted() call, JVM reset the interrupted value to: " + Thread.interrupted());
				break;
			}
			
		}
	}
}