package com.situ.day5;

import java.util.List;

import org.junit.Test;

public class Homework {

	@Test
	public void trim() {
		//String str = "   java android   ";
		String str = "      ";
		int beginIndex = 0;
		int endIndex = str.length() - 1;
		// 注意临界条件的判断，如果输入的字符串都是空格字符组成的这种临界条件
		while ((beginIndex <= endIndex) && (str.charAt(beginIndex) == ' ')) {
			beginIndex++;
		}
		while ((beginIndex <= endIndex) && (str.charAt(endIndex) == ' ')) {
			endIndex--;
		}
		String result = str.substring(beginIndex, endIndex + 1);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		String str = "abkkcdkkefkkskk";
		String key = "kk";
		int count = getSubCount(str, key);
		System.out.println(count);
	}
	
//	1、获取一个字符串在另一个字符串中出现的次数。
//    "abkkcdkkefkkskk"      "kk"
	public static int getSubCount(String str, String key) {
		int index = 0;
		int count = 0;
		while ((index = str.indexOf(key, index)) != -1) {
			count++;
			index = index + key.length();
		}
		
		return count;
	}
	
	/*public static int getSubCount(String str, String key) {
		int index = 0;
		int count = 0;

		for (int i = 0; i < str.length() - key.length(); i = index++, count++) {
			index = str.indexOf(key, index);
		}
		return count;

	}*/
	
//	实现函数public String[] toArray(List list)，其中参数list中元素类型为String字符串。
	public String[] toArray(List<String> list) {
		String[] array = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		
		return array;
	}
}
