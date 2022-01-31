package hashmapexample;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// HashMap Creation
		HashMap<Integer, String> empData = new HashMap<Integer, String>();
		empData.put(1234,"Rama");
		empData.put(1235,"Krishna");
		empData.put(1236,"Krishna");
		empData.put(1237,null);
		HashMap<Integer, String> empData1 = new HashMap<Integer, String>();
		empData1.put(1238,null);
		empData1.put(1239,"tony");
		empData1.put(null,"Ram");
		empData1.put(null,"Ramji");
		System.out.println(empData);
		
		System.out.println(empData.get(null));
		
		//how to retrieve all the keys
		Set<Integer> keys = empData.keySet();
		System.out.println(keys);
		
		//read all the values
		 Collection<String> values = empData.values();
		 System.out.println(values);
		 
		//entrySet is key,value pair in HashMap
		System.out.println("Iterating through HashMap to print all entries");
		for(Map.Entry<Integer, String> hmValue : empData.entrySet()) {
			System.out.println(hmValue.getKey()+ " "+ hmValue.getValue());
		}
		
		//removing elements from the HashMap
		//key based removal
		empData.remove(1234);
		
		System.out.println("Iterating through HashMap to print all entries after key based remove");
		for(Map.Entry<Integer, String> hmValue : empData.entrySet()) {
			System.out.println(hmValue.getKey()+ " "+ hmValue.getValue());
		}
		//Key value based removal
		empData.remove(1239, "tony");
		
		System.out.println("Iterating through HashMap to print all entries after key based remove");
		for(Map.Entry<Integer, String> hmValue : empData.entrySet()) {
			System.out.println(hmValue.getKey()+ " "+ hmValue.getValue());
		}
		
		
		empData.replace(1237, "Raju");
		System.out.println("Iterating through HashMap to print all entries after replace method");
		for(Map.Entry<Integer, String> hmValue : empData.entrySet()) {
			System.out.println(hmValue.getKey()+ " "+ hmValue.getValue());
		}
		
		System.out.println(empData.containsKey(1237));
		System.out.println(empData.containsValue("Raju"));
		
		empData.putAll(empData1);
		
		//entrySet is key,value pair in HashMap
		System.out.println("Iterating through HashMap to print all entries from both map");
		for(Map.Entry<Integer, String> hmValue : empData.entrySet()) {
			System.out.println(hmValue.getKey()+ " "+ hmValue.getValue());
		}
		
		
	}

}
