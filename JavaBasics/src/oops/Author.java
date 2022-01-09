package oops;

import java.util.Scanner;

public class Author {
	
	String name;
	String email;
	char gender;
	
	Scanner sc = new Scanner(System.in);
	
	public void readAuthorDetails() {
		System.out.println("Author Details");
		
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Email: ");
		email = sc.nextLine();
		
		System.out.print("Gender (M/F/U for unknown): ");
		gender = sc.next().charAt(0);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public void print() {
		System.out.println("Author Details");
		
		System.out.println("Name: " + name);
		System.out.println("Email: "+ email);
		System.out.println("Gender: " + gender);
	}

}