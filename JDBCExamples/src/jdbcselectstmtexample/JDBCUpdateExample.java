package jdbcselectstmtexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUpdateExample {
	public static void main(String[] args) {
		//step1 => to register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 => Establish the connection to DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moritech", "root", "root");
		//step 3 => Create statement
			Statement stmt = con.createStatement();
		// step 4 => Execute the statement
			int i =stmt.executeUpdate("update supervisiors  set  supervisior_name='superman' where supervisior_id = 20");
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

}
