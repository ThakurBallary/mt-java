package listexample;

import java.util.ArrayList;

import collectionswithuserdefinedobjects.Student;

public class StudentList {
	public static void main(String[] args) {
		
		//syntax for creating an arraylist to store student object
		//Generics declaration of ArrayList specifying that student objects are stored
		/*	following arrayList stores student objects which are created for userdefined class
			called "Student"*/
		ArrayList<Student> stdList = new ArrayList<Student>();
	
		/*	following arrayList stores Integer Wrapper class objects */
		ArrayList<Integer> integerData = new ArrayList<Integer>();
		//add method to add objects to ArrayList
		integerData.add(45678);
		//the above statement converts integer value in to Integer Object using autoboxing
		
		/*
		 * Type safety: The method add(Object) belongs to the raw type ArrayList. 
		 * References to generic type ArrayList<E> should be parameterized
		 */
		ArrayList<Integer>  integerData1 = new ArrayList<Integer> ();
		integerData1.add(1234);
		//integerData1.add("1234");
		
	}
}
