package oops.inheritance.accessemp;

public class CEO {
	
	public String name;
	protected String email;
	private String password;
	
	public CEO() {
		System.out.println("CEO default constructor");
	}
	
	protected CEO(String name) {
		System.out.println("CEO parameterised constructor");
		this.name = name;
	}
	
	protected CEO(CEO ceo) {
		System.out.println("CEO copy constructor");
		this.name = ceo.name;
		this.email = ceo.email;
		this.password = ceo.password;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	protected String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	protected void login() {
		System.out.println("login");
	}

}
