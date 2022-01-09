package oops.inheritance.single;

public class ContractEmployee extends Employee {
	
	float workingHours;
	
	public void calculateSalary() {
		System.out.println("ContractEmployee.calculateSalary");
	}
	
	public void readContractEmpDetails() {
		readEmpDetails();
		System.out.print("Working Hours: ");
		workingHours = sc.nextFloat();
	}
	
	public void displayContractEmpDetails() {
		displayEmpDetails();
		System.out.println("Working Hours: " + workingHours);
	}

}
