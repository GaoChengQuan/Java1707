package com.situ.day4;

public class AnimalDemo {
	public static void main(String[] args) {
		AbstractAnimal animal = new Stuent("zhangsan", 20, "Java1707");
		animal.showInfo();
		Stuent stuent = (Stuent) animal;
		stuent.study();
	}
}
