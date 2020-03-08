package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Snippet {
	
	public static void main(String a[]) {
		
	    List<String> list = new ArrayList<>();
	    list.add("element 41");
	    list.add("element 62");
	    list.add("element 13");
	    list.add("element 14");
	
	    
	
	    List<String> intersection = new ArrayList<>();
	    intersection.add("element 1");
	    intersection.add("element 2");
	    intersection.add("element 13");
	    intersection.add("element 10");
	    intersection.retainAll(list);
	    System.out.println("retainAll -- > " + intersection);
	    System.out.println("list -- > " + list);
	    
	    intersection.forEach(item -> {
	    	System.out.println(item);
	    });
	}
	
}

