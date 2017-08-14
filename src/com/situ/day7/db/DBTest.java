package com.situ.day7.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBTest {
	public static void main(String[] args) throws Exception {
//		AbstractDB db = new SqlServer();
//		db.getConnection();
		
		InputStream inputStream = new FileInputStream("db.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		String className = properties.getProperty("className");
		System.out.println(className);
		Class clazz = Class.forName("com.situ.day7.db." + className);
		AbstractDB db = (AbstractDB) clazz.newInstance();
		db.getConnection();
	}
}
