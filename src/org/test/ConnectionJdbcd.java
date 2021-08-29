package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionJdbcd {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
		// jdbc:oracle:thin:@localhost:1521:xe
		// oracle -->Databasse Name
		// thin ---> driver
		// @localhost -->Ip address where database is stored
		// 1521 -->Port Number
		// xe -->Service Provider

		String sql = "Select * from employees";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		ResultSet executeQuery = prepareStatement.executeQuery();

		while (executeQuery.next()) {
			int int1 = executeQuery.getInt("employee_id");
			System.out.println(int1);

			String string = executeQuery.getString("first_name");
			System.out.println(string);
		}

		connection.close();
		System.out.println("DD");
		System.out.println("EE");
		System.out.println("FF");
		System.out.println("GG");
	}

}
