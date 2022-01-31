package jdbccrudusingpreparedstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;


public class JdbcOperationsUsingPreparedStmt {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static Statement stmt = null;
	static Scanner sc = new Scanner(System.in);
	public JdbcOperationsUsingPreparedStmt() {
		conn = DBConnection.getDBConnection();
	}
	char ch = 'y';
	
	public void jdbcMenu() {
		while(ch=='y') {
		System.out.println("Enter the choice of JDBC Operation");
		System.out.println("insert : to insert the Supervisior data");
		System.out.println("update : to update the Supervisior data");
		System.out.println("delete : to delete the Supervisior data");
		System.out.println("selectone : to view a specific Supervisior data");
		System.out.println("selectall : to view all Supervisiors data");
		sc.nextLine();
		String choice = sc.nextLine();
		
		switch (choice) {
		case "insert":
			insertSupervisior();
			break;
		case "update":
			updateSupervisior();
			break;
		case "delete":
			deleteSupervisior();
			break;
		case "selectall":
			selectAllSupervisiors();
			break;
		case "selectone":
			selectSupervisiorById();
			break;
		default:
			System.out.println("no case found....");
			break;
		}
			System.out.println("do you want to continue");
			ch = sc.next().charAt(0);
		}
	}

	private void deleteSupervisior() {
try {
			
			String deleteStmt = "delete from supervisiors where supervisior_id = ?";
			 pstmt = conn.prepareStatement(deleteStmt);
			//read the values and set the values to the ?
			System.out.println("Enter the supervisior details to delete");
			System.out.println("enter supervisior id to update...");
			int sid = sc.nextInt();
			pstmt.setInt(1, sid);
			int i =pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("Not deleted as supervisior with id = " + sid + " not found");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void selectSupervisiorById() {
		try {
			
			String selectStmt = "select * from supervisiors where supervisior_id = ?";
			 pstmt = conn.prepareStatement(selectStmt);
			//read the values and set the values to the ?
			System.out.println("Enter the supervisior id to view details");
			//System.out.println("enter supervisior id to update...");
			int sid = sc.nextInt();
			pstmt.setInt(1, sid);
			//int i =pstmt.executeUpdate();
			ResultSet rs = pstmt.executeQuery();		
				System.out.println("supervisior found successfully");
				System.out.println("supervisior details are .........");
				while(rs.next()) {
					System.out.println("Supervisior Name :=" + rs.getString("supervisior_name"));
					System.out.println("Supervisior City :=" + rs.getString("supervisior_city"));
					System.out.println("Supervisior Salary :=" + rs.getFloat("supervisior_salary"));
				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void selectAllSupervisiors() {
try {
			
			String selectStmt = "select * from supervisiors";
			 pstmt = conn.prepareStatement(selectStmt);
			ResultSet rs = pstmt.executeQuery();	
			System.out.println("supervisior details are .........");
			System.out.println("=======================================================================================================================================================================================================");
			System.out.println("Supervisior ID" + "\t" + "Supervisior Name" + "\t" + "Supervisior City" + "\t" + "Supervisior Salary");
			System.out.println("=======================================================================================================================================================================================================");
	
			while(rs.next()) {
					System.out.println(rs.getInt("supervisior_id") + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getFloat(4));
					//System.out.println("Supervisior Name :=" + rs.getString("supervisior_name"));
					//System.out.println("Supervisior City :=" + rs.getString("supervisior_city"));
					//System.out.println("Supervisior Salary :=" + rs.getFloat("supervisior_salary"));
				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void updateSupervisior() {
		try {
			
			String updateStmt = "update supervisiors set supervisior_name = ? where supervisior_id = ?";
			 pstmt = conn.prepareStatement(updateStmt);
			//read the values and set the values to the ?
			System.out.println("Enter the supervisior details to update");
			System.out.println("enter supervisior name to update...");
			String sname = sc.nextLine();
			pstmt.setString(1, sname);
			System.out.println("enter supervisior id to update...");
			int sid = sc.nextInt();
			pstmt.setInt(2, sid);
			int i =pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("updated successfully");
			}else {
				System.out.println("Not updated as supervisior with id = " + sid + " not found");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void insertSupervisior() {
		//step1 => to register the driver
				try {
					
					String insertStmt =  
							"insert into supervisiors "
							+ "(supervisior_name,supervisior_city,supervisior_salary) "
							+ "values(?,?,?);";
				//step 3 => Create statement
					 pstmt = conn.prepareStatement(insertStmt);
					//read the values and set the values to the ?
				
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
