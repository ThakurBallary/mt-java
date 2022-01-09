package string;

import common.Util;

public class NonRepeatingChar {

	public static void main(String[] args) {
		
		String str = "apple";
		int strLen = str.length();
		
		int[] count = Util.charCounter(str);
		String result = " ";
		for (int i = 0; i < strLen; i++) {
			char ch = str.charAt(i);
			if (count[ch] == 1) {
				result += ch;
			}
		}
		
		System.out.println(result);

	}

}
