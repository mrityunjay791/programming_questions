package com.thread;

public class WorkedThreadExtendingThread extends Thread {
	private String data;
	private long sleepTime;

	public WorkedThreadExtendingThread(String data, Long sleepTime) {
		super(data);
		this.data = data;
		this.sleepTime = sleepTime;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i =0; i< 5; i++) {
			System.out.println(Thread.currentThread().getName() + ": "+ data + i);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
