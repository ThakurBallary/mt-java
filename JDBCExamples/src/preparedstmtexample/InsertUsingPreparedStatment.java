package preparedstmtexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingPreparedStatment {

	public static void main(String[] args) {
		//step1 => to register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 => Establish the connection to DB
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/moritech", "root", "root");
			
			String insertStmt =  
					"insert into supervisiors "
					+ "(supervisior_name,supervisior_city,supervisior_salary) "
					+ "values(?,?,?);";
		//step 3 => Create statement
			PreparedStatement pstmt = con.prepareStatement(insertStmt);
			//read the values and set the values to the ?
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter the supervisior details");
			
			System.out.println("enter supervisior name...");
			//sc.nextLine();
			String sname = sc.nextLine();
			pstmt.setString(1, sname);
			System.out.println("Enter supervisior city...");
			String scity = sc.nextLine();
			pstmt.setString(2, scity);
			System.out.println("Enter the supervisior salary...");
			float ssalary = sc.nextFloat();
			pstmt.setFloat(3, ssalary);
		// step 4 => Execute the statement
			int i =pstmt.executeUpdate();
		// step 5 => show the results
			if(i != 0) {
				System.out.println("Inserted successfully");
			}else {
				System.out.println("Not inserted successfully");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
