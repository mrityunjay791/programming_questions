package com.collection.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToSet {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 1; i < 5; i++) {
			map.put("key"+i, i);
		}
		
		List<Integer> listOfValues = map.entrySet().stream().map(item -> item.getValue()).collect(Collectors.toList());
		
		System.out.println(listOfValues);
		
		String[] keys = map.entrySet().stream().map(item->item.getKey()).
				collect(Collectors.toList()).toArray(new String[0]);
		
		for(String str: keys) {
			System.out.println(str);
		}
		
		
		
	}

}
