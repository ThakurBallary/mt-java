package crudcollectionswithuserdefinedobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class EMS {
	//ArrayList<Employee> empData = new ArrayList<Employee>();
	//Concurrent Collections
	CopyOnWriteArrayList<Employee> empData1 = new CopyOnWriteArrayList<Employee>();
	Scanner sc = new Scanner(System.in);
	//Employee emp = new Employee();
	String operation;
	
	public void addEmployee(Employee e) {
		//System.out.println("to add employee enter the employee details");
		empData1.add(e);
	}
	
	public Employee readEmpDetails(Employee e) {
		System.out.println("Read the employee details ..............");
		System.out.println("Enter the employee id.....");
		e.setEmpId(sc.nextInt());
		System.out.println("Enter the employee name.....");
		sc.nextLine();
		e.setEmpName(sc.nextLine());
		System.out.println("Enter the employee salary.....");
		e.setEmpSalary(sc.nextFloat());
		return e;
	}
	
	//Iterator<Employee> empItr = empData.iterator();
	
	public void removeEmployee(int empId) {
		for(Employee emp1 : empData1) {
			if(emp1.getEmpId() == empId) {
				empData1.remove(emp1);
			}
		}
		/*
		 * Iterator<Employee> empItr111 = empData1.iterator();
		 * while(empItr111.hasNext()) { if(empItr111.next().getEmpId() == empId) {
		 * empItr111.remove(); } }
		 */
		
	}
	
	public void listEmployees() {
		Iterator<Employee> empItr11 = empData1.iterator();
		System.out.println("Employee Data ..........");
		System.out.println("=========================================================================");
		System.out.println("EmployeeId" + "\t" + "EmployeeName" + "\t" +"EmployeeSalary");
		System.out.println("=========================================================================");
		System.out.println(empData1);
		while(empItr11.hasNext()) {
			Employee emp11 = empItr11.next();
			System.out.println(emp11.getEmpId()+ "\t\t" +emp11.getEmpName()+ "\t\t" +emp11.getEmpSalary());
		}

	}
	
	public void empOperations() {
		
		char ch = 'y';
		
		while(ch == 'y') {
			
		
		System.out.println("Enter the Operation...");
		System.out.println("add : adding Employee");
		System.out.println("remove : removing Employee");
		System.out.println("readall : to list all Employee Details");
		System.out.println("read : to show an Employee Details");
		System.out.println("update : to update an Employee Details");
		System.out.println("sort : to sort  Employee Details");

		sc.nextLine();
		operation = sc.nextLine();
		Employee emp = null;
		switch (operation) {
		case "add":
			emp = new Employee();
			addEmployee(readEmpDetails(emp));
			break;
		case "remove":
			System.out.println("Enter the empId to remove from list...");
			int empId = sc.nextInt();
			removeEmployee(empId);
			break;
		case "readall" :
			listEmployees();
			break;
		default:
			System.out.println("No such operation....");
			break;
		}
		System.out.println("Do you want to continue......");
		ch = sc.next().charAt(0);		
		}
	}

}
