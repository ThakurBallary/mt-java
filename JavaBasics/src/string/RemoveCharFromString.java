package string;

public class RemoveCharFromString {

	public static void main(String[] args) {
		
		System.out.println(removeCharFromString('p', "apple"));
		System.out.println(removeCharFromString('l', "apple"));

	}
	
	public static String removeCharFromString(char ch, String str) {
		
		int strLen = str.length();
		String result = "";
		
		for (int i = 0; i < strLen; i++) {
			char c = str.charAt(i);
			if (c != ch) {
				result += c;
			}
		}
		
		return result;
	}

}
