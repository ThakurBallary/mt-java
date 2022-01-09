package string;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("abcd", "dcab"));
		System.out.println(isAnagram("abcd", "dcaba"));

	}
	
	public static boolean isAnagram(String s1, String s2) {
		
		int s1Len = s1.length();
		int s2Len = s2.length();
		
		if (s1Len != s2Len) {
			return false;
		}
		
		int[] count = new int[256];
		
		for (int i = 0; i < s1Len; i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		for (int c : count) {
			if (c != 0) {
				return false;
			}
		}
		
		return true;
	}

}
