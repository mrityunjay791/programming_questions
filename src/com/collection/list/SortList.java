package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(12);
		list.add(4);
		list.add(22);
		list.add(23);
		list.add(27);

		Collections.sort(list, (o1, o2) -> o2 > o1 ? 1 : o1 == o2 ? 0 : -1);
		System.out.println(list);
		
	}
}
	
