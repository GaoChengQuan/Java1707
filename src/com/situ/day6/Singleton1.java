package com.situ.day6;

//饿汉式
//以空间换时间
public class Singleton1 {
	private static final Singleton1 instance = new Singleton1();
	
	private Singleton1() {
	}
	
	public static Singleton1 getInstance() {
		return instance;
	}
}
