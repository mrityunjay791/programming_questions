package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeMapExample {

	public static void main(String[] args) {

		Map<Integer, List<String>> users = new HashMap<>();
		System.out.println(users);
		
		for(int p = 1; p < 10; p++) {
			List <String> ob = new ArrayList<>();
			ob.add("p"+p);
			users.put(p, ob);
		}
		
		System.out.println(users.get(2));
		// Find the entry whose key is just less than the given key
		
	}

}
