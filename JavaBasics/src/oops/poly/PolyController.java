package oops.poly;

public class PolyController {

	public static void main(String[] args) {
		
		Payroll p = new Payroll();
		p.adjustedSalary(1000);
		
		Admin a = new Admin();
		a.adjustedSalary(2000);
		
		Academic ac = new Academic();
		ac.adjustedSalary(3000);

	}

}
