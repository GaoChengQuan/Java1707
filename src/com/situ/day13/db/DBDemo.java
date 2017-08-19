package com.situ.day13.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.situ.util.JdbcUtil;

public class DBDemo {
	@Test
	public void createTable() {
	    Connection connection = null;
	    Statement statement = null;
	    try {
	       // 2、获取连接对象Connection
	       connection = JdbcUtil.getConnection();
	       // 3、写sql语句
	       String sql = "CREATE TABLE teacher(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(10));";
	       //4、创建Statement
	       statement = connection.createStatement();
	       //5、执行sql语句
	        //更新：delete/insert/update       executeUpdate()    返回值int表示影响的行数
	        //查询：select                     executeQuery()    返回结果集ResultSet
	       int result = statement.executeUpdate(sql);
	       System.out.println(result);
	    } catch (SQLException e) {
	       e.printStackTrace();
	    } finally {
	       JdbcUtil.close(connection, statement);
	    }
	}

	@Test
	public void selectFromStudent() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = JdbcUtil.getConnection();
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
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//6、关闭
			JdbcUtil.close(connection, statement, resultSet);
		}
	}



	
}
