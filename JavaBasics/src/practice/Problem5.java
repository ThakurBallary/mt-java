/*

5.Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order. 

*/

package practice;

import java.util.Scanner;
import common.Util;

public class Problem5 {
	
	public static void main(String[] args) {
		
		int len = 3;
		int[] arr = new int[len];
		int[] reverseArr = new int[len];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0, j = len - 1; i < len; i++, j--) {
			reverseArr[i] = arr[j];
		}
		
		sc.close();
		
		Util.printArray(reverseArr);
	}

}
