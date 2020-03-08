package com.collection.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListExample {

	public static void main(String[] args) {
		
		Set<String> daysOfWeek = new HashSet<>();

        // Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");
        System.out.println(daysOfWeek);
        
        
		
		Iterator<?> itr = daysOfWeek.iterator();
	
		while(itr.hasNext()) {
			String st = (String) itr.next();
			System.out.println(st);
			itr.remove();
			System.out.println("removed: "+st);
		}
		
		 System.out.println(daysOfWeek);
	        
		
	}


}
