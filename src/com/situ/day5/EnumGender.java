package com.situ.day5;

public enum EnumGender {
	//The constructor EnumGender(String) is undefined
	MALE("男"), FEMALE("女");
	
	private String value;
	
	private EnumGender(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
