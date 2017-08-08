package com.situ.day5;

public class EnumTest {
	public static void main(String[] args) {
		EnumGender enumGender = EnumGender.MALE;
		if (enumGender == EnumGender.MALE) {
			System.out.println("MALE");
		}
		
		if (enumGender.equals(EnumGender.MALE)) {
			System.out.println("MALE");
		}
		
		switch (enumGender) {
		case MALE:
			System.out.println("Male");
			break;
		case FEMALE:
			System.out.println("Female");
			break;
		default:
			break;
		}
	}
}
