package com.situ.day3;

public class Student extends Person{
	private int age;
	private String name;
	private String gender;
	private String className;
	public static String country = "CN";
	
	//静态代码块
	static {
	    System.out.println("static code.");
	}


	public Student() {
		super();
		 System.out.println("Student");
		// TODO Auto-generated constructor stub
	}

	public Student(int age, String name, String gender, String className) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.className = className;
	}
	
	public static void show() {
		//Cannot make a static reference to the non-static field name
		//在静态方法里面不能调用非静态的属性name，也包括非静态的方法。
		//System.out.println("country: " + country + ", name: " + name);
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", gender=" + gender + ", className=" + className + "]";
	}
	
	public void print() {
		System.out.println("Student");
	}

}
