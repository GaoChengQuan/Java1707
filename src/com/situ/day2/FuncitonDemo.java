package com.situ.day2;

import org.junit.validator.PublicClassValidator;

public class FuncitonDemo {
	
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 5;
//		int max = num1 > num2 ? num1 : num2;
//		System.out.println(max);
		int max = getMax(num1, num2);
		System.out.println(max);
		
		int num3 = 12;
		int num4 = 5;
		System.out.println(getMax(num3, num4));
//		int max1 = num3 > num4 ? num3 : num4;
//		System.out.println(max);
	} 
	
	public static int getMax(int num1, int num2) {
		int max = num1 > num2 ? num1 : num2;
		return max;
	} 
}
