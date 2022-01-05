package practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		reverse(n);

	}
	
	public static int reverse(int n) {
		int r = 0;
		while (n > 0) {
			r *= 10;
			r += n % 10;
			n /= 10;
		}
		System.out.println(r);
		return r;
	}

}
