package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		students.add(new Student("S1", 10));
		students.add(new Student("S2", 101));
		students.add(new Student("S3", 1));
		students.add(new Student("S4", 20));
		System.out.println("before sorting: " + students);
		Collections.sort(students);
		System.out.println("after sorting by roll number: " + students);
 	}

}

class Student implements Comparable<Student> {
	private String name;
	private int rollNo;
	
	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
		
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.rollNo, o.rollNo);
	}
	
	 @Override
	    public String toString() {
	        return "Student{rollNo=" + rollNo + ", name='" + name + "'}";
	    }

}
