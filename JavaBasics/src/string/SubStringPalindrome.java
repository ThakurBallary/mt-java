package string;

public class SubStringPalindrome {

	public static void main(String[] args) {
		
		String substr = subString("abdade", 2, 5);
		System.out.println("substr: " + substr);
		System.out.println("isPalindrome: " + isPalindrome(substr));

	}
	
	public static String subString(String str, int startIndex, int endIndex) {
		String s = "";
		int strLen = str.length();
		
		if (startIndex >= 0 && endIndex < strLen) {
			for (int i = startIndex; i <= endIndex; i++) {
				s += str.charAt(i);
			}
		}
		
		return s;
	}
	
	public static boolean isPalindrome(String str) {
		int strLen = str.length();
		for (int i = 0, j = strLen - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j) ) {
				return false;
			}
		}
		return true;
	}

}
