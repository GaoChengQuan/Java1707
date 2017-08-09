package com.situ.day6;
//懒汉式
//以时间换空间
public class Singleton {
	//3.定义一个变量来存储创建好的唯一的实例。
	private static Singleton instance;
	
	//1.私有化构造方法，好在内部控制创建实例的数量
	private Singleton() {
		
	}
	
	//2.定义一个方法来为客户端提供实例
	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
}
