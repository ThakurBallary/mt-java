package oops.inheritance.accessemp;

public class EmpController {

	public static void main(String[] args) {
		
		// invoke default constructor 
		Employee empDefault = new Employee();
		empDefault.id = 1;
		empDefault.name = "Abhi";
		empDefault.email = "abhi@mt.com";
		empDefault.setPassword("secret");
		System.out.println(empDefault.getPassword());
		
		// invoke parameterised constructor
		Employee empParams = new Employee(1, "Abhi");
		empParams.email = "arya@mt.com";
		empParams.setPassword("perfect");
		System.out.println(empParams.id);
		System.out.println(empParams.name);
		System.out.println(empParams.getPassword());
		
		// invoke copy constructor
		Employee empCopy = new Employee(empParams);
		System.out.println(empCopy.id);
		System.out.println(empCopy.name);
		System.out.println(empCopy.email);
		System.out.println(empCopy.getPassword());
		
		// invoke protected login
		empDefault.login();
		
	}

}
