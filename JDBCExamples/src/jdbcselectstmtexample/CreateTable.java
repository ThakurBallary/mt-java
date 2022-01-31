package jdbcselectstmtexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	static Connection con; //= null;
	static Statement stmt; // = null;
	public static void main(String[] args) {
		
	
	//step1 => to register the driver
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2 => Establish the connection to DB
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moritech", "root", "root");
			//step 3 => Create statement
				stmt = con.createStatement();
				String createTable = "create table sample123456(id int,name varchar(30));";
			// step 4 => Execute the statement
				int i =stmt.executeUpdate(createTable);
			// step 5 => show the results
				if(i == 0) {
					System.out.println("table created successfully");
				}else {
					System.out.println("table not created");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					con.close();
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

}
