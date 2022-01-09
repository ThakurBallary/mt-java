package string;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "reverse";
		char[] charArray = s.toCharArray();
		
		for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
			char c = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = c;
		}
		
		String reverse = "";
		for (char c : charArray) {
			reverse += c;
		}
		
		System.out.println(reverse);

	}

}
