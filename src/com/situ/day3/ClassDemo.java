package com.situ.day3;

import java.util.Scanner;

import org.junit.Test;

public class ClassDemo {
	@Test
	public void test22() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name = scanner.next();
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("zhangsan");
		Student student2 = new Student();
		student2.setName("lisi");
	}
	
	@Test
	public void test() {
		int age = 20;
		String name = "zhangsan";
		String gender = "男";
		String className = "Java1707";
		
		printStudent(age, name, className);
	}

	private void printStudent(int age, String name, String className) {
		System.out.println(age);
	}
	
	@Test
	public void test33() {
		Student student = new Student();
		student.print();
	}
	
	@Test
	public void test55() {
		Student.show();
		Student student = new Student();
		student.show();
	}
}
