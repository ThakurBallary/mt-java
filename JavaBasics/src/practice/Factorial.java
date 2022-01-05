package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(getFactorial(n));

	}
	
	public static int getFactorial (int n) {
		int f = 1;
		while (n > 1) {
			f *= n--;
		}
		return f;
	}

}
