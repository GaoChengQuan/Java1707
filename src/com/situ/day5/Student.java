package com.situ.day5;

public class Student {
	private String name;
	private int age;
	private String zhuanye;

	public Student() {
		super();
	}

	public Student(String name, int age, String zhuanye) {
		super();
		this.name = name;
		this.age = age;
		this.zhuanye = zhuanye;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getZhuanye() {
		return zhuanye;
	}

	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}

	@Override
	public String toString() {
		return "姓名：" + name + ",年龄：" + age + ",专业：" + zhuanye;
	}

}
