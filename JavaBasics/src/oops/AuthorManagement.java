package oops;

import java.util.Scanner;

public class AuthorManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Author a = new Author();
		char ch = 'y';

		while (ch == 'y') {
			System.out.println("Enter the Transaction");
			System.out.println("Enter 'read' to enter author details");
			System.out.println("Enter 'name' to view name");
			System.out.println("Enter 'email' to view email");
			System.out.println("Enter 'setEmail' to set email");
			System.out.println("Enter 'gender' to view gender");
			System.out.println("Enter 'print' to view author details");
			String transaction = sc.next();

			switch (transaction) {
				case "read":
					a.readAuthorDetails();
					break;
				case "name":
					System.out.println("Name: " + a.getName());
					break;
				case "email":
					System.out.println("Email: " + a.getEmail());
					break;
				case "setEmail":
					System.out.print("Enter email: ");
					sc.nextLine();
					String email = sc.nextLine();
					a.setEmail(email);
					break;
				case "gender":
					System.out.println("Gender: " + a.getGender());
					break;
				case "print":
					a.print();
					break;
				default:
					System.out.println("Wrong choice");
					break;
			}
			
			System.out.print("Do you want to continue (y/n): ");
			ch = sc.next().charAt(0);
		}
		
		sc.close();
	}

}