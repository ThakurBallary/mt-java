package common;

public class Util {

	public static void printArray(int[] arr) {
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static int[] charCounter(String str) {
		int count[] = new int[256];
        int len = str.length();
        
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }
        
        return count;
	}

}
