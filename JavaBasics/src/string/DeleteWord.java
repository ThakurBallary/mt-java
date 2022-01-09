package string;

public class DeleteWord {

	public static void main(String[] args) {

		String s = "Hyderabad Bangalore Mumbai Delhi";
		System.out.println(deleteWord(s, "Bangalore"));
		System.out.println(deleteWord(s, "Delhi"));

	}
	
	public static String deleteWord (String s, String w) {
		String r = "", t = "";
		int sLen = s.length();
		int wLen = w.length();
		for (int i = 0; i < sLen; i++) {
			for (int j = 0; j < wLen; j++) {
				char ch = s.charAt(i);
				if (ch == w.charAt(j)) {
					t += ch;
					i++;
					if (t.length() == wLen) {
						t = "";
						j = 0;
						break;
					}
				} else {
					r += t;
					r += ch;
					t = "";
					j = 0;
					break;
				}
			}
		}
		return r;
	}

}
