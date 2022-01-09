package string;

public class WordsCount {

	public static void main(String[] args) {
		
		System.out.println(wordsCount("Count number of words in this string"));
		System.out.println(wordsCount("Object oriented programming language"));

	}
	
	public static int wordsCount (String str) {
		int count = 0;
		int strLen = str.length();
		
		for (int i = 0; i < strLen; i++) {
			if (str.charAt(i) == ' ' || i == strLen - 1) {
				count++;
			}
		}
		
		return count;
	}

}
