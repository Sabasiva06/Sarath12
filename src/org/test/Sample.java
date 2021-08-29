package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Configuration
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// COnnection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
		// jdbc:oracle:thin:@localhost:1521:xe
		// oracle -->Databasse Name
		// thin ---> driver
		// @localhost -->Ip address where database is stored
		// 1521 -->Port Number
		// xe -->Service Provider

		// 3.Writting querry
		String s = "Select first_name,employee_id from employees";

		//  4.Prepare Statement
 		PreparedStatement prepareStatement = connection.prepareStatement(s);

		// 5.Execute the query
		ResultSet executeQuery = prepareStatement.executeQuery();

		// 6.Iterating the condtion
		while (executeQuery.next()) {
			String string = executeQuery.getString("first_name");
			System.out.println(string);

			int int1 = executeQuery.getInt("employee_id");
			System.out.println(int1);
		}

		connection.close();
		

	}

}
