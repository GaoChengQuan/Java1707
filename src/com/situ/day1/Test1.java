package com.situ.day1;

import org.junit.Test;

public class Test1 {
	public static void main(String[] args) {
		/*char ch = 'a';
		System.out.println((char)97);
		System.out.println(ch + 1);//98
		System.out.println((char)(ch + 1));//b
		char ch1 = '中';
		char ch2 = '国';
		char ch3 = 234;
		short s1 = 99;
		//Type mismatch: cannot convert from int to short
//		s1 = s1 + 3;
		
		
		System.out.println(8 / 3);
		System.out.println(8 % 3);
		
		System.out.println(2 / 7);
		System.out.println(2 % 7);*/
		
		/*int num1 = 3;
		int num2 = 5;
		System.out.println(num1 < 0 && num1++ < num2);
		System.out.println(num1);
		System.out.println(num2);*/
		
		 /*int num1 = 13;
		 int num2 = 5;
		 int max = num1 > num2 ? num1 : num2;
		 System.out.println(max);*/
		 
		 /*if (num1 > num2) {
			System.out.println(num1);
		 } else {
			 System.out.println(num2);
		 } */

		 /*int age = 20;
		 System.out.println("我的年龄是" + age);

		 System.out.println(10 + 20 + "" + 30);//3030
		 System.out.println("" + 10 + 20 + 30);//102030
*/
		 
		 /*int num1 = 3;
	     int num2 = 5;
	     System.out.println("before num1 : " + num1);
	     System.out.println("before num2 : " + num2);
	     int temp = num1;
	     num1 = num2;
	     num2 = temp;
	     System.out.println("after num1 : " + num1);
	     System.out.println("after num2 : " + num2);*/
		
//	    1、能被4整除，但是不能被100整除 &&
//	    ||
//	    2、能被400整除

		/*Scanner scanner = new Scanner(System.in);
	    System.out.println("请输入年份：");
	    int year = scanner.nextInt();
	    if ((() && ()) || ()) {
			
		}
	    if (((year % 4 == 0) && (year % 100 != 0)) 
	    		|| (year % 400 == 0)) {
			
		}*/
	    
	    //swap();
		
	}
	
	@Test
	public void ttt() {
		System.out.println("434");
	}
	
	@Test
	public void swap() {
		int num1 = 3;
		int num2 = 5;
		System.out.println("before num1 : " + num1);
		System.out.println("before num2 : " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("after num1 : " + num1);
		System.out.println("after num2 : " + num2);
	}
}
