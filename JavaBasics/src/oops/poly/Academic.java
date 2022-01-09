package oops.poly;

public class Academic extends Payroll {
	
	public String name;
	public int salary;
	
	Academic(){};
	
	Academic(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	protected int adjustedSalary(int bonus) {
		int result = SALARY + bonus + 100; 
		System.out.println("Academic adjustedSalary: " + result);
		return result;
	}
	
	public void giveLecture() {
		System.out.println("giveLecture");
	}

}
