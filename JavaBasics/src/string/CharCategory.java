package string;

public class CharCategory {

	public static void main(String[] args) {
		
		String s = "a1$^e8";
		System.out.println(charAtIndexAlphaNumSym(0, s));
		System.out.println(charAtIndexAlphaNumSym(1, s));
		System.out.println(charAtIndexAlphaNumSym(2, s));
		
	}
	
	public static String charAtIndexAlphaNumSym(int i, String s) {
		char ch = s.charAt(i);
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			return "Alphabet";
		}
		if (ch >= '0' && ch <= '9') {
			return "Number";
		}
		return "Symbol";
	}

}
