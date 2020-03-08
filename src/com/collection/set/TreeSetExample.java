package com.collection.set;

import java.util.HashSet;
import java.util.Set;
class SortEmpObject {
	int id;
	String name;
	public SortEmpObject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class TreeSetExample {

	public static void main(String[] args) {

//		SortedSet<String> weekDays = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		
		Set<String> weekDays = new HashSet<>();
		// Adding new elements to a TreeSet
		weekDays.add("Monday");
		weekDays.add("Tuesday");
		weekDays.add("Wednesday");
		weekDays.add("Thursday ");
		weekDays.add("Friday ");
		weekDays.add("Saturday  ");
		weekDays.add("Sunday");

		System.out.println("weekDays Set : " + weekDays);

		// Now, lowercase elements will also be considered as duplicates
		weekDays.add("sunday");
		System.out.println("After adding \"sunday\" : " + weekDays);
	}

}
