package com.situ.day13.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class DBDemo {
	@Test
	public void selectFromStudent() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			//1、加载驱动 Class.forNmae("");
			Class.forName("com.mysql.jdbc.Driver");
			//2、获取连接对象Connection。
			connection = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/java1707", "root", "123");
			//3、写sql语句。
			String sql = "SELECT * FROM student;";
			//4、创建Satement。
			statement = connection.createStatement(); 
			//5、执行sql语句。
			//更新：delete/update/insert   executeUpdate   返回值int表示影响的行数。
			//查询：select                         executeQuery       返回结果集ResultSet。
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				String name= resultSet.getString("name");
				int age = resultSet.getInt("age");
				String gender = resultSet.getString("gender");
				String address = resultSet.getString("address");
				System.out.println("name:" + name + ",age:" + age
						+ ",gender:" + gender + ",address:" + address);
			}
			//6、关闭
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
