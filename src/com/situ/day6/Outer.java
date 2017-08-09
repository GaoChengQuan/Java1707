package com.situ.day6;

public class Outer {

	public void show() {
		System.out.println("Outer.show()");
	}
	
	public class Inner {
		public void show() {
			System.out.println("Inner.show()");
		}
	}
}
