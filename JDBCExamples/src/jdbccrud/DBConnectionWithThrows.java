package jdbccrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionWithThrows {
	static Connection con; // = null;
	static Statement stmt; // = null;
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	return con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moritech", "root", "root");
	}
}
