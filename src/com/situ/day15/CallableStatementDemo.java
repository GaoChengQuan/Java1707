package com.situ.day15;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.situ.util.JdbcUtil;

public class CallableStatementDemo {

	public static void main(String[] args) {
		Connection connection = null;
		CallableStatement callableStatement = null;
		ResultSet resultSet = null;
		try {
			connection = JdbcUtil.getConnection();
			callableStatement = connection.prepareCall("CALL show_student1");
			resultSet = callableStatement.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				System.out.println("name: " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, callableStatement, resultSet);
		}
		
	}
}
