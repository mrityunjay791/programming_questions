package com.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> dayNumberMapping = new LinkedHashMap<>();

		// Adding new key-value pairs to the LinkedHashMap
		dayNumberMapping.put("Mon", 1);
		dayNumberMapping.put("Tus", 2);
		dayNumberMapping.put("Wen", 3);
		dayNumberMapping.put("Thu", 4);
		dayNumberMapping.put("Fri", 5);
		dayNumberMapping.put("Sat", 6);

		// Add a new key-value pair only if the key does not exist 
		// in the LinkedHashMap, or is mapped to `null`
		dayNumberMapping.putIfAbsent("Sun", 7);

		System.out.println(dayNumberMapping);
		
		Map<String, String> husbandWifeMapping = new LinkedHashMap<>();
		husbandWifeMapping.put("Jack", "Marie");
		husbandWifeMapping.put("Chris", "Lisa");
		husbandWifeMapping.put("Steve", "Jennifer");

		String husband = "Jack";
		String wife = husbandWifeMapping.remove(husband);
		System.out.println(wife);
		
		LinkedHashMap<String, String> userCityMapping = new LinkedHashMap<>();

		userCityMapping.put("Rajeev", "Bengaluru");
		userCityMapping.put("Chris", "London");
		userCityMapping.put("David", "Paris");
		userCityMapping.put("Jesse", "California");

		userCityMapping.forEach((user, city) -> {
		 System.out.println(user + " => " + city);
		});
		System.out.println("=============================");
		userCityMapping.entrySet().forEach(entry -> {
			 System.out.println(entry.getKey() + " => " + entry.getValue());
			});
		System.out.println("=============================");
		Iterator<Map.Entry<String, String>> userCityMappingIterator = userCityMapping.entrySet().iterator();
		while (userCityMappingIterator.hasNext()) {
			Map.Entry<String, String> entry = userCityMappingIterator.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		System.out.println("=============================");
		
		userCityMappingIterator = userCityMapping.entrySet().iterator();
		userCityMappingIterator.forEachRemaining(entry -> {
		 System.out.println(entry.getKey() + " => " + entry.getValue());
		});
	}

}
