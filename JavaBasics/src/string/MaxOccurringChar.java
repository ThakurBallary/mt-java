package string;

import common.Util;

public class MaxOccurringChar {

	public static void main(String[] args) {

		String str = "apple";
		
		int[] count = Util.charCounter(str);
		
		int maxCount = 0;
		char maxOccurringChar = ' ';
		
		for (int i = 0; i < count.length; i++) {
			if (maxCount < count[i]) {
				maxCount = count[i];
				maxOccurringChar = (char) i;
			}
		}
		
		System.out.println(maxOccurringChar);

	}

}
