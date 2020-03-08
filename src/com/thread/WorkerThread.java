package com.thread;

public class WorkerThread implements Runnable {

	private String data;

	public WorkerThread(final String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] [data=" + this.data + "] Message " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
