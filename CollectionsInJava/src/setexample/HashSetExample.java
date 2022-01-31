package setexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>  integerData = new HashSet<Integer> ();
		//add() => Appends the specified element to the end of this list.
		integerData.add(1234);
		integerData.add(1235);
		integerData.add(1238);
		integerData.add(1239);
		integerData.add(1256);
		integerData.add(1266);
		integerData.add(1266);
		integerData.add(1266);
		System.out.println(integerData);
		
		Iterator<Integer> itr = integerData.iterator();
		System.out.println("Elements of HashSet....");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
