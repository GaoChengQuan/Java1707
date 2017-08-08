package com.situ.day4;

import org.junit.Test;

public class StringDemo {
	@Test
	public void test1() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if (str1.equals(str2)) {
			System.out.println("equals");
		}
		
		if (str1 == str2) {
			System.out.println("==");
		}
	}
	
	@Test
	public void test2() {
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		if (str1 == str2) {
			System.out.println("str1 == str2");
		}
		
		if (str2 == str3) {
			System.out.println("str2 == str3");
		}
		
		if (str1 == str3) {
			System.out.println("str1 == str3");
		}
		
		str1 = "asd";
		System.out.println(str1);
		System.out.println(str3);
	}
	
	@Test
	public void test4() {
		String str = "Java Androidv";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf('v'));
		System.out.println(str.indexOf('v', 3));
		System.out.println(str.indexOf("And"));
		System.out.println("-----------");
		System.out.println(str.lastIndexOf('v'));
		System.out.println("---------");
		System.out.println(str.contains("And"));
		System.out.println("----------");
		System.out.println(str.startsWith("Java"));
		System.out.println(str.startsWith("Java "));
		System.out.println(str.startsWith("Ja"));
		System.out.println("-----------");
		char[] chArray = {'J', 'a', 'v', 'a'};
		String str11 = new String(chArray);
		System.out.println(str11);// Java
		char[] chArr = str11.toCharArray();
	}
	
	@Test
	public void testString() {
		String str = "dsff nnd Javahdif";
		String str1 = str.replace('f', 'y');
		System.out.println(str);
		System.out.println(str1);
		String[] strArray = str.split(" ");
		for (String string : strArray) {
			System.out.println(string);
		}
		System.out.println("--------");
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 13));
		System.out.println("-------------");
		String s = "    Java Androif     ";
		System.out.println(s.trim());
	}
}
