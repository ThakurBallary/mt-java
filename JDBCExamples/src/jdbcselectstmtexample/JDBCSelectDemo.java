package jdbcselectstmtexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelectDemo {

	public static void main(String[] args) {
		//step1 => to register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 => Establish the connection to DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moritech", "root", "root");
		//step 3 => Create statement
			Statement stmt = con.createStatement();
		// step 4 => Execute the statement
			ResultSet rs =stmt.executeQuery("select * from supervisiors");
		// step 5 => show the results
			while(rs.next()) {
				System.out.println(rs.getInt("supervisior_id") + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
