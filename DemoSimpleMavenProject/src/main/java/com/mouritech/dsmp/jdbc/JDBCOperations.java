package com.mouritech.dsmp.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCOperations {

	static Connection conn = null;
	static Statement stmt = null;
	public JDBCOperations() {
		//try {
		 conn = DBConnection.getDBConnection();
		/* } finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}

	public void insertData() {

		try {
			// step 3 => Create statement
			stmt = conn.createStatement();
			// step 4 => Execute the statement
			int i = stmt.executeUpdate("insert into supervisiors \r\n"
					+ "(supervisior_name,supervisior_city,supervisior_salary) values\r\n"
					+ "('Rama123','Hyderabad',56000);");
			// step 5 => show the results
			if (i != 0) {
				System.out.println("Inserted successfully");
			} else {
				System.out.println("Not inserted successfully");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateData() {
		try {
		//step 3 => Create statement
			stmt = conn.createStatement();
		// step 4 => Execute the statement
			int i =stmt.executeUpdate("update supervisiors  set  supervisior_name='hulk' where supervisior_id = 21");
		// step 5 => show the results
			if(i != 0) {
				System.out.println("updated successfully");
			}else {
				System.out.println("Not updated successfully");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	Scanner sc = new Scanner(System.in);
	public void jdbcOperations() {
		
		System.out.println("Enter the jdbc operation");
		System.out.println("insert : to insert the data");
		System.out.println("update : to insert the data");
		sc.nextLine();
		String choice = sc.nextLine();
		
		switch (choice) {
		case "insert":
			insertData();
			break;
		case "update":
			updateData();
			break;

		default:
			break;
		}
	}
}
