package com.situ.day16;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateDemo {
	@Test
	public void testDate() {
		Date date = new Date();
		System.out.println(date);//Thu Aug 17 09:23:14 CST 2017
		// 2017-08-17 09:23:14
		// yyyy-MM-dd hh:mm:ss
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
		String time = simpleDateFormat.format(date);
		System.out.println(time);
	}
	
	
	
	
	
	
	
	
}
