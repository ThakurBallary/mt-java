package practice;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0, on = n;
		while (n > 0) {
			sum += Factorial.getFactorial(n % 10);
			n /= 10;
		}

		if (sum == on) {
			System.out.println("Strong number");
		} else {
			System.out.println("Not strong number");
		}

	}

}
