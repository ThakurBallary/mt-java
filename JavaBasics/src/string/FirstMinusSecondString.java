package string;

public class FirstMinusSecondString {

	public static void main(String[] args) {
		
		String s1 = "abcxyz";
		String s2 = "byax";
		
		int s1Len = s1.length();
		int s2Len = s2.length();
		
		int[] count = new int[256];
		
		for (int i = 0; i < s2Len; i++) {
			count[s2.charAt(i)]++;
		}
		
		String result = "";
		
		for (int i = 0; i < s1Len; i++) {
			char ch = s1.charAt(i);
			if (count[ch] < 1) {
				result += ch; 
			}
		}
		
		System.out.println(result);
		
	}

}
