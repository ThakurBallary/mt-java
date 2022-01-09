package oops.poly;

public class Payroll {
	
	public static final int SALARY = 9000; 
	
	protected int adjustedSalary(int bonus) {
		int result = SALARY + bonus + 400; 
		System.out.println("Payroll adjustedSalary: " + result);
		return result;
	}

}
