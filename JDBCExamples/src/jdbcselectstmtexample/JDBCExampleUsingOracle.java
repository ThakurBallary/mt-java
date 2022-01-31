package jdbcselectstmtexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExampleUsingOracle {

	public static void main(String[] args) {
		//step1 => to register the driver
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				//step 2 => Establish the connection to DB
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
				//step 3 => Create statement
					Statement stmt = con.createStatement();
				// step 4 => Execute the statement
					ResultSet rs =stmt.executeQuery("select * from sample");
				// step 5 => show the results
					while(rs.next()) {
						System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
