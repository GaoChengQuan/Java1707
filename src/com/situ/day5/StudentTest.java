package com.situ.day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class StudentTest {
	public static void main(String[] args) {
		Student student;
		Scanner input = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		for (;;) {
			System.out.println("****************");
			System.out.println("添加学生信息请输入1");
			System.out.println("查看学生信息请输入2");
			System.out.println("查询学生信息请输入3");
			System.out.println("****************");
			int num = input.nextInt();
			switch (num) {
			case 1:
				inputStudentList(list);
				break;
			case 2:
				printStudentList(list);
				break;
			case 3:
				System.out.println("请输入学生姓名");
				String name = input.next();
				student = chaxun(list, name);
				if(student == null){
					System.out.println("没找到该学生");
				}else {
					System.out.println(student);
				}
				break;
			default:
				break;
			}
		}
	}

	public static List<Student> inputStudentList(List<Student> list) {
		Scanner input = new Scanner(System.in);
		int flag;
		do {
			System.out.println("请输入你的姓名：");
			String name = input.next();
			System.out.println("请输入你的年龄：");
			int age = input.nextInt();
			System.out.println("请输入你的专业：");
			String zhuanye = input.next();
			Student student = new Student(name, age, zhuanye);
			list.add(student);
			System.out.println("继续请输入1，退出请输入2");
			flag = input.nextInt();
		} while (flag == 1);
		
		return list;
	}
	
	public static void printStudentList(List<Student> list) {
		for(Student student : list){
			System.out.println(student);
		}
	}
	
	public static Student chaxun(List<Student> list,String name) {
		Student student = null;
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			student = it.next();
			if(student.getName().equals(name)) {
				return student;		
			}
		}
		return null;
	}
}