package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapExampleIterator {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 1; i < 10; i++) {
			map.put("key"+i, i);
		}
		
		System.out.println("==========For Each lambda exp=============");
		map.forEach((key,value) -> {
			System.out.println(key+" : "+ value);
		});
		
		System.out.println("==========For Each=============");
		
		for(Entry<String, Integer> item : map.entrySet()) {
			System.out.println(item.getKey() + " :=> "+ item.getValue());
		}
		
		
		System.out.println("==========By using Iterator=============");
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Integer> item = iterator.next();
			System.out.println(item.getKey() + " :=> "+ item.getValue());
			
		}
		
		System.out.println("==========LAMBDA=============");
		
		map.entrySet().forEach(item -> {
			System.out.println(item.getKey() + " :=> "+ item.getValue());
		});
		
		
		System.out.println(map.values());
		System.out.println(
				map.entrySet().
				stream().filter(item -> item.getValue() % 2 == 0)
				.collect(Collectors.toList()));
	}

}
