package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) throws ObjectNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> integerData = new ArrayList<Integer>();
		// add() => Appends the specified element to the end of this list.

		integerData.add(1239);
		integerData.add(1234);
		integerData.add(1235);
		integerData.add(1238);
		integerData.add(456);
		System.out.println("data before  sorting ....." + integerData);
		Collections.sort(integerData);

		System.out.println("data after sorting ....." + integerData);

		/*
		 * ArrayList<Integer> integerData1 = new ArrayList<Integer> ();
		 * integerData1.add(1239); integerData1.add(1250); integerData1.add(1239);
		 * integerData1.add(1280); integerData1.add(1290); integerData1.add(1299);
		 * 
		 * System.out.println(integerData); // System.out.println(integerData1);
		 * 
		 * //integerData.addAll(integerData1);
		 * 
		 * for(int i =0;i<integerData.size();i++) {
		 * System.out.println(integerData.get(i)); }
		 * 
		 * System.out.println("Enter the value of object to remove......"); Integer
		 * value = sc.nextInt(); if(integerData.remove(value)) {
		 * System.out.println("removed the object"); }else { throw new
		 * ObjectNotFoundException("Object not found with value =  " + value); }
		 * System.out.println("Values after removing the specified object"); for(int i
		 * =0;i<integerData.size();i++) { System.out.println(integerData.get(i)); }
		 * 
		 * System.out.println("Enter the index to remove object......"); int index =
		 * sc.nextInt(); integerData.remove(index);
		 * System.out.println("Values after removing the specified object using index");
		 * for(int i =0;i<integerData.size();i++) {
		 * System.out.println(integerData.get(i)); }
		 * 
		 * for(int i =0;i<integerData.size();i++) { for(int
		 * j=integerData.size();j>0;j--) { System.out.println(integerData.get(i) + "\t"
		 * + integerData.get(j) ); if((integerData.get(i)).equals(integerData.get(j))) {
		 * break; } } }
		 */
	}
}
