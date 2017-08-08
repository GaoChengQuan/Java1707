package com.situ.day4;

public class Teacher extends AbstractPerson{
	private double salary;

	@Override
	protected void showInfo() {
		System.out.println("name: " + name + ", age: " + age + 
				", salary: " + salary);
	}
	
	public void teach() {
		
	}
	
}
