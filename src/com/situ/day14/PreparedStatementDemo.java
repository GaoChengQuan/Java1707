package com.situ.day14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.situ.util.JdbcUtil;

public class PreparedStatementDemo {
	public static void main(String[] args) {
		//loginPreparedStatement("zhangsan", "123");
		loginPreparedStatement("dfhddf' OR 1=1 -- ", "123");
	}

	public static void loginPreparedStatement(String name, String password) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = JdbcUtil.getConnection();
			//?表示一个参数的占位符
			String sql = "SELECT * FROM USER WHERE NAME=? AND PASSWORD=?;";
			preparedStatement = connection.prepareStatement(sql);
			//设置参数的值                    参数的位置，参数值
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			/*while (resultSet.next()) {
				String userName = resultSet.getString("name");
				String userPassword = resultSet.getString("password");
				System.out.println("name: " + userName + ", password: " + userPassword);
			}*/
			if (resultSet.next()) {
				System.out.println("登陆成功");
			} else {
				System.out.println("登陆失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, preparedStatement, resultSet);
		}
	}
	
	
	@Test
	public void insertBatch() {
	    Connection connection = null;
	    PreparedStatement statement = null;
	    try {
	       connection = JdbcUtil.getConnection();
	       String sql = "INSERT INTO student(NAME,age,gender,address) VALUES(?,?,?,?);";
	       statement = connection.prepareStatement(sql);
	       for (int i = 1; i <= 100; i++) {
	    	   statement.setString(1, "zhang" + i);
	    	   statement.setInt(2, 23);
	    	   statement.setString(3, "男");
	    	   statement.setString(4, "青岛");
	    	   statement.addBatch();
	       }
	       //int[] 
	       int[] results = statement.executeBatch();
	       for (int i : results) {
			System.out.println(i);
	       }
	       statement.clearBatch();
	    } catch (SQLException e) {
	       e.printStackTrace();
	    } finally {
	       JdbcUtil.close(connection, statement);
	    }
	}
	
	@Test
	public void transactionDemo() {
		String sql1 = "UPDATE account SET money=money-1000 WHERE NAME='zhangsan';";
		String sql2 = "UPDATE account SET money=money+1000 WHERE NAME='lisi';";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = JdbcUtil.getConnection();
			//手动开启事务，默认情况是true
			connection.setAutoCommit(false);
			//1.执行第一个sql语句
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.executeUpdate();
			int result = 1 / 0;
			//1.执行第二个sql语句
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.executeUpdate();
			
			//提交事物
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			JdbcUtil.close(connection, preparedStatement);
		}
		
	}
	
	
	
	
	
	
	
	
}
