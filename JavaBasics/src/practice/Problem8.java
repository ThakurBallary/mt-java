/* 

8.Write a program to shift every element of an array to circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4

*/

package practice;

import common.Util;

public class Problem8 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		
		int lastIndex = arr.length - 1;
		int temp = arr[lastIndex];
		for (int i = lastIndex; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		Util.printArray(arr);
	}

}
