package com.situ.day6;

public class OddThread extends Thread{
	
	public OddThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i+=2) {
			//Thread.currentThread()当前正在执行的线程
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}
