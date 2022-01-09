package oops.inheritance.single;

import java.util.Scanner;

public class Employee {

	String empId;
	String empName;
	String empDept;
	int empAge;
	
	Scanner sc = new Scanner(System.in);
	
	public void calculateSalary() {
		System.out.println("Employee.calculateSalary");
	}
	
	public void readEmpDetails() {
		System.out.println("Employee Details");
		
		System.out.print("ID: ");
		empId = sc.nextLine();
		
		System.out.print("Name: ");
		empName = sc.nextLine();
		
		System.out.print("Dept: ");
		empDept = sc.nextLine();
		
		System.out.print("Age: ");
		empAge = sc.nextInt();
	}
	
	public void displayEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("ID: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Dept: " + empDept);
		System.out.println("Age: " + empAge);
	}
	
}
