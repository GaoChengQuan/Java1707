package com.situ.day6;

import org.junit.Test;

public class ThreadDemo {
	public static void main(String[] args) {
		RunnableThread runnableThread = new RunnableThread();
		Thread thread = new Thread(runnableThread);
		thread.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main: " + i);
		}
	}
	
	@Test
	public void testThread() {
		ThreadTest threadTest = new ThreadTest();
		threadTest.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main: " + i);
		}
	}
	
	@Test
	public void testNumberThread() {
		OddThread oddThread = new OddThread("奇数线程");
		oddThread.start();
		EvenThread evenThread = new EvenThread("偶数线程");
		evenThread.start();
	}
	
	@Test
	public void testNumberThread1() {
		NumberThread oddThread = new NumberThread("奇数线程", 1);
		oddThread.start();
		NumberThread evenThread = new NumberThread("偶数线程", 2);
		evenThread.start();
	}
}
