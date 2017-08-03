package com.situ.day2;

import java.util.Arrays;

import org.junit.Test;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 2;
		array[1] = 5;
		array[2] = 7;
		array[3] = 3;
		int sum = getSum(array);
		System.out.println("sum:" + sum);
	}
	
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		return sum;
	}

	@Test
	public void test() {
		int[] array = new int[4];
		array[0] = 3;
		array[1] = 4;
		array[2] = 5;
		array[3] = 7;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("---------");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test5() {
		int[] array = new int[]{3, 5, 1, 6};
		for (int i = 0; i <= array.length; i++) {
		   System.out.println(array[i]);
		}
	}
	
	@Test
	public void test6() {
		int[] array = new int[] { 3, 5, 1, 6 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(array[1]);
		array = null;// NullPointerException
		System.out.println(array[1]);
	}
	
	@Test
	public void test7() {
		boolean[] doubleArray = new boolean[10];
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.println(doubleArray[i]);
		}
	}
	
	@Test
	public void teest8() {
		Student[] students = new Student[10];
		System.out.println();
	}
	
	@Test
	public void sort() {
		long start = System.currentTimeMillis();
		int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		long end = System.currentTimeMillis();
		long delta = end - start;
		System.out.println("-----------");
		System.out.println(delta);
	}
}
