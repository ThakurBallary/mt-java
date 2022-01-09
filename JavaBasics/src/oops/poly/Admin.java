package oops.poly;

public class Admin extends Payroll {
	
	public String name;
	public int salary;
	
	Admin(){};
	
	Admin(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	protected int adjustedSalary(int bonus) {
		int result = SALARY + bonus + 200; 
		System.out.println("Admin adjustedSalary: " + result);
		return result;
	}
	
	public void doAdminStuff() {
		System.out.println("do admin stuff");
	}
	
}
