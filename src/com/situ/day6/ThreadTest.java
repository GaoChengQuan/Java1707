package com.situ.day6;

public class ThreadTest extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			//Unhandled exception type InterruptedException
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}
