package com.mouritech.printempdetails.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.mouritech.printempdetails.model.Employee;
import com.mouritech.printempdetails.util.DataBaseUtil;

public class EmployeeDAO {

	static Connection conn = null;
	static PreparedStatement pstmt = null;
	ArrayList<Employee> empList = new ArrayList<Employee>();
	Employee emp = null;
	
	public EmployeeDAO(){
		conn = DataBaseUtil.getDBConnection();
	}
	
	public List<Employee> getAllEmployees() {
		try {
			pstmt = conn.prepareStatement("select * from employee_data");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				empList.add(emp);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return empList;
	}

	public Employee addEmployee(Employee emp2) {
		try {
			pstmt = conn.prepareStatement("insert into employee_data values(?,?);");
			pstmt.setInt(1, emp2.getEmpId());
			pstmt.setString(2, emp2.getEmpName());
			int i = pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Inserted");
			}else {
				System.out.println("Not Inserted");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return emp2;
	}

	public String deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			pstmt = conn.prepareStatement("delete from employee_data where empid = ?;");
			pstmt.setInt(1, empid);
			
			i = pstmt.executeUpdate();
	
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(i!=0) {
			return "deleted";
		}else {
			return "not deleted";
		}
	}

	
	public Employee updateEmployee(int empid,Employee emp) {
		int i=0;
		try {
			pstmt = conn.prepareStatement("update employee_data set empname =? where empid = ?");
			pstmt.setInt(2, emp.getEmpId());
			pstmt.setString(1, emp.getEmpName());
			 i= pstmt.executeUpdate();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if(i!=0) {
			return emp;
		}else {
			return null;
		}
	}

	public Employee getEmployeeById(int empid) {
		try {
			pstmt = conn.prepareStatement("select * from employee_data where empid = ?");
			pstmt.setInt(1, empid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return emp;
	}
}
