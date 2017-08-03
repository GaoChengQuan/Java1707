package com.situ.day2;

import org.junit.Test;

public class WhileDemo {
	@Test
	public void test2() {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			System.out.println(i);
			sum = sum + i;
			i++;
		}
		System.out.println("sum: " + sum);
	}
	
	/**
	 * 1*9=9     2*9=18     3*9=27     4*9=36     5*9=45     6*9=54     7*9=63     8*9=72     9*9=81
	 */
	@Test
	public void test3() {
		int i = 1;
		while (i <= 9) {
			System.out.print(i + "*9=" + (i * 9) + "\t");
			i++;
		}
	}

	@Test
	public void test4() {
		//随机生成1-500的整数
		//Returns a double value with a positive sign, 
		//greater than or equal to 0.0 and less than 1.0. 
		// 0.0 ------------- 0.99999999
		// 0.0               499.999999 + 1
		// 1.0---------------500.999999
		// 1-----------------1000
		int random = (int)(Math.random() * 1000 + 1);
		System.out.println(random);
	}

}
