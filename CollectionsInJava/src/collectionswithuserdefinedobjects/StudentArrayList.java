package collectionswithuserdefinedobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentArrayList {

	public static void main(String[] args) {
		
		//create an arraylist to store student objects
		ArrayList<Student> studentData = new  ArrayList<Student>();
		
		//create student object to store in above arraylist
		studentData.add(new Student(1234,"Rama",76.5f));
		
		Student st = new Student(1235, "Ram", 89.7f);
		studentData.add(st);
		
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
		studentData.add(st1);
		
		System.out.println(studentData);
		
		Iterator<Student> studentItr = studentData.iterator();
		System.out.println("Student Data ..........");
		System.out.println("=========================================================================");
		System.out.println("StudentId" + "\t" + "StudentName" + "\t" +"StudentMarks");
		System.out.println("=========================================================================");

		while(studentItr.hasNext()) {
			Student st11 = studentItr.next();
			System.out.println(st11.getStudentId()+ "\t\t" +st11.getStudentName()+ "\t\t" +st11.getStudentMarks());
		}
		
		//System.out.println("data before  sorting ....." + studentData);
		Collections.sort(studentData);

		//System.out.println("data after sorting ....." + studentData);
		Iterator<Student> studentItr11 = studentData.iterator();
		System.out.println("Student Data After Sorting on Name..........");
		System.out.println("=========================================================================");
		System.out.println("StudentId" + "\t" + "StudentName" + "\t" +"StudentMarks");
		System.out.println("=========================================================================");

		while(studentItr11.hasNext()) {
			Student st11 = studentItr11.next();
			System.out.println(st11.getStudentId()+ "\t\t" +st11.getStudentName()+ "\t\t" +st11.getStudentMarks());
		}

	}

}
