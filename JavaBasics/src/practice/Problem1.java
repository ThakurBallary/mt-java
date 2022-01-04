/*

1. Take an array of 10 elements. Split it into middle and store the elements in two different arrays. 
E.g.-
INITIAL array :
58    24    13    15    63    9    8    81    1    78

After splitting :
58    24    13    15    63
9    8    81    1    78

*/

package practice;

import common.Util;

public class Problem1 {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 58, 24, 13, 15, 63, 9, 8, 81, 1, 78 };
		
		int firstHalfLength = arr.length / 2;
		int[] firstHalf = new int[firstHalfLength];
		
		int secondHalfLength = arr.length - firstHalfLength;
		int[] secondHalf = new int[secondHalfLength];
		
		for (int i = 0; i < firstHalfLength; i++) {
			firstHalf[i] = arr[i];
		}
		
		for (int i = 0, j = firstHalfLength; i < secondHalfLength; i++, j++) {
			secondHalf[i] = arr[j];
		}
		
		Util.printArray(arr);
		Util.printArray(firstHalf);
		Util.printArray(secondHalf);
	}

}
