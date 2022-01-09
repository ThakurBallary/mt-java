package string;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String str = "apple";
		int strLen = str.length();
		
		int[] count = new int[256];
		String result = " ";
		for (int i = 0; i < strLen; i++) {
			char ch = str.charAt(i);
			if (count[ch]++ == 0) {
				result += ch;
			}
		}
		
		System.out.println(result);

	}

}
