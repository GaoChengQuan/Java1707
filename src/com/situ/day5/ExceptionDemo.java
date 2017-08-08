package com.situ.day5;

import org.junit.Test;

public class ExceptionDemo {
	public static void main(String[] args) {
		fun();
	}

	private static void fun() {
		fun();
	}
	
	@Test
	public void testException() {
		int num1 = 3;
		int num2 = 0;
		try {
			// 需要被检测的代码(可能会出现异常，也可能不会出现异常)
			int result = num1 / num2;//ArithmeticException
		} catch (Exception e) {
			System.out.println("Catch");
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
		} finally {
			System.out.println("Finally");
		}
		System.out.println("-------------");
	}
	
	
	@Test
	public void teest22() {
		int result = 0;
		try {
			result = div(6, 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}
	
	public int div(int num1, int num2) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int[] array = new int[3];
		//System.out.println(array[3]);
		String str = null;
		str.charAt(0);
		return num1 / num2;
	}
	
}
