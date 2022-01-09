package oops.inheritance.accessemp;

public class Employee extends CEO {
	
	public int id;
	
	Employee() {
		this(1); // calling one constructor from another constructor
		System.out.println("Employee default constructor");
	}
	
	Employee(int id) {
//		this();
		System.out.println("Employee single parameterised constructor");
		this.id = id;
	}
	
	Employee(int id, String name) {
		System.out.println("Employee multi parameterised constructor");
		this.id = id;
		super.name = name;
	}
	
	Employee(Employee employee) {
		System.out.println("Employee copy constructor");
		name = employee.name;
		email = employee.email;
	}

}
