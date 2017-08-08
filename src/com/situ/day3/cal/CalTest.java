package com.situ.day3.cal;

public class CalTest {
	public static void main(String[] args) {
		Cal cal = new Add(3, 5);
		int result = cal.getResult();
		System.out.println(result);
	}
}
