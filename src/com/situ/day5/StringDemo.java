package com.situ.day5;

public class StringDemo {
	public static void main(String[] args) {
		//String str = "Java";
		//String str = new String("Java Android");
		
		String str1 = "java";
		String str2 = "ios";
		String str3 = "php";
		
		String str = str1 + str2 + str3;
		
		StringBuffer stringBuffer = new StringBuffer();
		/*stringBuffer.append(str1);
		stringBuffer.append(str2);
		stringBuffer.append(str3);*/
		stringBuffer.append(str1).append(str2).append(str3);
		System.out.println(stringBuffer);
		
		
		
	}
}
