package string;

public class UppercaseCharsFront {

	public static void main(String[] args) {
		
		String s = "wHoELrLlOd";
		int sLen = s.length();
		
		String u = "";
		String l = "";
		
		for (int i = 0; i < sLen; i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				u += ch;
			} else {
				l += ch; 
			}
		}
		
		System.out.println(u + l);

	}

}
