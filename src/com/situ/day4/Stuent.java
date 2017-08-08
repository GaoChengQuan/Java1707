package com.situ.day4;

public class Stuent extends AbstractPerson{
	private String className;
	
	public Stuent(String name, int age, String className) {
		this.name = name;
		this.age = age;
		this.className = className;
	}

	@Override
	protected void showInfo() {
		System.out.println("name: " + name + ", age: " + age + 
				", className: " + className);
	}
	
	public void study() {
		System.out.println(name + " 正在学习");
	}
	
	//Cannot override the final method from AbstractPerson
	@Override
	public void walk() {
		super.walk();
	}

}
