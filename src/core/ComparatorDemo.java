package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student1> students = new ArrayList<>();
		students.add(new Student1("S1", 10));
		students.add(new Student1("S2", 101));
		students.add(new Student1("S3", 1));
		students.add(new Student1("S4", 20));
		System.out.println("before sorting: " + students);
		// Sorting by name using Comparator
		Collections.sort(students, new Comparator<Student1>() {

			@Override
			public int compare(Student1 o1, Student1 o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.rollNo, o2.rollNo);
			}
			
		});
		System.out.println("after sorting by roll number: " + students);
		
		students.sort((s1, s2) -> s1.name.compareToIgnoreCase(s2.name));
		System.out.println("after sorting by name number: " + students);

	}

}

class Student1 {
	String name;
	int rollNo;
	
	Student1(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
		
	 @Override
	    public String toString() {
	        return "Student{rollNo=" + rollNo + ", name='" + name + "'}";
	    }

}

