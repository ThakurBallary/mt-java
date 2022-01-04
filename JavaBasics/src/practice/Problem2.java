/*

2. If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], 
your program should be able to find that the sub array lies between the indexes 3 and 8.

*/

package practice;

import common.Util;

public class Problem2 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		int[] subArr = new int[6];
		
		for (int i = 0, j = 3; j <= 8; i++, j++) {
			subArr[i] = arr[j];
		}
		
		Util.printArray(arr);
		Util.printArray(subArr);
		
	}

}
