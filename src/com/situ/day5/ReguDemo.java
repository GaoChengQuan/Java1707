package com.situ.day5;

import org.junit.Test;

public class ReguDemo {

	@Test
	public void testMatches() {
		//小写字母，大写字母，数字，下划线，中划线
		// (\.[a-zA-Z0-9_-])+
		String regex = "[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-])+";
		String mail = "sydai@sdhi.com.cn.123.dfi";
		if (mail.matches(regex)) {
			System.out.println("是邮箱");
		} else {
			System.out.println("不是邮箱");
		}
	}
	
	@Test
	public void testSplit() {
		//String str = "Java Android 1705";
		String str = "Java17 Android 1705";
		String[] array = str.split("17");
		for (String string : array) {
			System.out.println(string);
		}
	}
	
	@Test
	public void testSplit1() {
		//要求这个数字最后以23结尾
		String str = "sdewr7823shdhAS3dfhodf123hl";
		// \d*23
		String[] array = str.split("\\d*23");
		for (String string : array) {
			System.out.println(string);
		}
	}
	
	@Test
	public void testReplace() {
		String str = "sdh23sbdkjgk3434hsdh545jdlfj89";
		str = str.replaceAll("\\d+", "#NUMBER");
		System.out.println(str);
	}
}
