package com.collection.sortobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComprableExample {

	public static void main(String[] args) {

		
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(2,"Amit","Patna",10));
		studentList.add(new Student(1,"Ankit","Sur",12));
		studentList.add(new Student(4,"Mohan","Pa",17));
		studentList.add(new Student(3,"Rakesh","Mumbai",8));
		
		
//		Collections.sort(studentList, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getAddress().length() - o2.getAddress().length();
//			}
//		});
		
		Collections.sort(studentList, Comparator.comparing(Student::getAddress).thenComparing(Student::getName));
		System.out.println(studentList);
	}

}
