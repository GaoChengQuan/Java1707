package com.situ.day6;

public class EvenThread extends Thread{
	public EvenThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 2; i <= 100; i+=2) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}
