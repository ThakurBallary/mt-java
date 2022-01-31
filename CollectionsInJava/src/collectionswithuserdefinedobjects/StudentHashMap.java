package collectionswithuserdefinedobjects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentHashMap {

public static void main(String[] args) {
		
		//create an arraylist to store student objects
		HashMap<Integer,Student> studentData = new  HashMap<Integer,Student>();
		
		//create student object to store in above arraylist
		studentData.put(100,new Student(1234,"Rama",76.5f));
		
		Student st = new Student(1235, "Ram", 89.7f);
		studentData.put(101,st);
		
		//capture data of student using scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student details.....");
		System.out.println("Enter the student id.....");
		int sid = sc.nextInt();
		System.out.println("Enter the student name.....");
		sc.nextLine();
		String sname = sc.nextLine();
		System.out.println("Enter the student marks.....");
		float smarks = sc.nextFloat();
		Student st1 = new Student(sid, sname,smarks);
		studentData.put(103,st1);
		
		System.out.println(studentData);
		
		//Iterator<Student> studentItr = studentData.iterator();
		System.out.println("Student Data ..........");
		System.out.println("=========================================================================");
		System.out.println("StudentId" + "\t" + "StudentName" + "\t" +"StudentMarks");
		System.out.println("=========================================================================");

		//entrySet is key,value pair in HashMap
		System.out.println("Iterating through HashMap to print all entries");
		for(Map.Entry<Integer, Student> hmValue : studentData.entrySet()) {
			//System.out.println(hmValue.getKey()+ " "+ hmValue.getValue());
			int key = hmValue.getKey();
			Student stObj = hmValue.getValue();
			System.out.println(stObj.getStudentId()+ "\t" +stObj.getStudentName()+ "\t" +stObj.getStudentMarks());
		}
		

	}

}
