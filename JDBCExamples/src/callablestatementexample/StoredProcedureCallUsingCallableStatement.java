package callablestatementexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcedureCallUsingCallableStatement {
	static Connection conn = null;
	static String sql = "{call product_proc1(?,?,?)}";
	
	

	public static void main(String[] args) {
		conn = DBConnection.getDBConnection();
		if(conn != null) {
		try {
			CallableStatement cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, 1);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setDouble(3, 25);
			cstmt.registerOutParameter(3, Types.DOUBLE);
			cstmt.execute();
			System.out.println("Product Name = "+ cstmt.getString(2));
			System.out.println("Product Old Price = "+ cstmt.getDouble(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else {
		System.out.println("Connection not established");
	}
	}
}
