package com.situ.day3;

import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		//输入学生信息
		Student[] studentArray = inputStudentsInfo();
		//打印所有学生信息
		printAllStudentInfo(studentArray);
		//根据条件查询学生信息
		sarchByCondition(studentArray);
	}

	private static void sarchByCondition(Student[] studentArray) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("----------");
			System.out.println("根据条件查询学生信息：");
			System.out.println("根据姓名来查询：1");
			System.out.println("根据年龄来查询：2");
			System.out.println("根据性别来查询：3");
			System.out.println("退出：0");
			System.out.println("----------");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("退出程序");
				break;
			}
			
			switch (type) {
			case 1:// 根据姓名来查询
				System.out.println("请输入要查询的姓名");
				String name = scanner.next();
				searchByName(studentArray, name);
				break;
			default:
				break;
			}
		}
	}

	private static void searchByName(Student[] studentArray, String name) {
		boolean isSearchByNameFound = false;
		for (int i = 0; i < studentArray.length; i++) {
			Student student = studentArray[i];
			if (name.equals(student.getName())) {
				printStudentInfo(student);
				isSearchByNameFound = true;
			}
		}
		if (isSearchByNameFound == false) {
			System.out.println("没有该姓名的学生");
		}
	}

	private static void printAllStudentInfo(Student[] studentArray) {
		for (int i = 0; i < studentArray.length; i++) {
			Student stu = studentArray[i];
			printStudentInfo(stu);
		}
	}

	/**
	 * 
	 * @return 
	 */
	private static Student[] inputStudentsInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的数量：");
		int count = scanner.nextInt();
		Student[] studentArray = new Student[count];
		for (int i = 0; i < studentArray.length; i++) {
			Student student = new Student();
			System.out.println("请输入姓名：");
			String name = scanner.next();
			System.out.println("请输入性别：");
			String gender = scanner.next();
			System.out.println("请输入年龄：");
			int age = scanner.nextInt();
			student.setName(name);
			student.setAge(age);
			student.setGender(gender);

			studentArray[i] = student;
		}
		return studentArray;
	}

	/**
	 * 
	 * @param student
	 */
	private static void printStudentInfo(Student student) {
		System.out.println("----------");
		System.out.println("姓名：" + student.getName());
		System.out.println("性别：" + student.getGender());
		System.out.println("年龄：" + student.getAge());
		System.out.println("----------");
	}
	
}
