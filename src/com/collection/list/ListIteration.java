package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		for(int i = 1; i < 10; i++) {
			list.add(""+i);
		}
		
		
		ListIterator<String> itr = list.listIterator(); 
	
		
		while(itr.hasNext()) {
			System.out.print(" "+ itr.next());
			
		}
		itr.add("kpk");
		System.out.println("result: " +itr.previous());
		
		while(itr.hasPrevious()) {
			System.out.println(" res-> "+ itr.previous());
		}
		
		System.out.println("result2: "+ itr.next());
		
		Iterator<String> itr2 = list.iterator(); 
		while(itr2.hasNext()) {
			System.out.println(" res2-> "+ itr2.next());
		}
		itr2.remove();
//		System.out.println(" res22-> "+ itr2.next());
		System.out.println("\n"+list);
	}

}
