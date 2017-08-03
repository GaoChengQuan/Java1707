package com.situ.day2;

import java.util.Iterator;

import org.junit.Test;

public class ForDemo {

	@Test
	public void test1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello World!");
		}
	}
	
	@Test
	public void countNum() {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count:" + count);
	}

//	****
//	****
//	****
	@Test
	public void test3() {
		// ****
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		// *
		// *
		// *
		for (int i = 1; i <= 3; i++) {
			System.out.println("*");
		}
	}
	
	@Test
	public void test4() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	*
//	**
//	***
//	****
//	*****
	@Test
	public void test5() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i ; j++) {
				// i=1   j=1
				// i=2   j=2
				// i=3   j=3
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Test
	public void test6() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				// 1*9=9
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}

	
}
