package com.collection.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CreateHashMapExample {
	
	private static void collectionViewsDemo() {

		 Map<String, String> map = new HashMap<>();
		 map.put("key1", "value1");
		 map.put("key2", "value2");
		 map.put("key3", "value3");
		 
		 for(Entry<String, String> entry: map.entrySet()) {
			 System.out.println(entry.getKey() + "->"+ entry.getValue());
		 }
		 // Returns a Set view of the keys contained in this map
		 Set<String> keys = map.keySet();
		 System.out.println("keys"+keys);
		 
		 // Returns a Collection view of the values contained in this map
		 Collection<String> values = map.values();
		 System.out.println("values"+values);
		 // Returns a Set view of the mappings contained in this map
		 Set<Entry<String, String>> entry = map.entrySet();

		 // iterate map using java 8 forEach method
		 map.forEach((k, v) -> {
		  System.out.println(k);
		  System.out.println(v);
		 });

		 for (Entry<String, String> pair : entry) {
		  System.out.println(pair.getKey());
		  System.out.println(pair.getValue());
		 }
		}
	
	
	
	private static void multmapDemo() {
		 Map<String, List<String>> multimap = new HashMap<>();
		 List<String> multiValueList = new ArrayList<>();
		 multiValueList.add("value1");
		 multiValueList.add("value2");
		 multiValueList.add("value3");
		 
		 List<String> multiValueList2 = new ArrayList<>();
		 multiValueList2.add("value4");
		 multiValueList2.add("value5");
		 multiValueList2.add("value6");
		 multimap.put("key1", multiValueList);
		 
		 multimap.put("key2", multiValueList2);
		 
		 multimap.forEach((key,val) -> {
			 System.out.println(key +" : "+ val);
		 });
		 
		 
	}
	
	public static void forEachWithMap() {

		 // Before Java 8, how to loop map
		 final Map<Integer, Person> map = new HashMap<>();
		 map.put(1, new Person(100, "Ramesh"));
		 map.put(2, new Person(101, "Ram"));
		 map.put(3, new Person(102, "Prakash"));
		 map.put(4, new Person(103, "Amir"));
		 map.put(5, new Person(104, "Sharuk"));

		 for (final Entry<Integer, Person> entry : map.entrySet()) {
		  System.out.println(entry.getKey() + " : " +entry.getValue().getName());
		 }
		}
	
    public static void main(String[] args) {
        // Creating a HashMap
     Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);
        numberMapping.put("three", 3);

        System.out.println(numberMapping);
        
        
        Map<String, String> husbandWifeMapping = new HashMap<>();
        husbandWifeMapping.put("Jack", "Marie");
        husbandWifeMapping.put("Chris", "Lisa");
        husbandWifeMapping.put("Steve", "Jennifer");

        // Remove a key from the HashMap only if it is mapped to the given value
        // Ex - Divorce "Jack" only if He is married to "Linda"
        boolean isRemoved = husbandWifeMapping.remove("Jack", "Marie");
        System.out.println("Did Jack get removed from the mapping? : " + isRemoved+""+husbandWifeMapping);
        
        
        Map<String, String> currencies = new HashMap<String, String>();
        currencies.put("USA", "USD");
        currencies.put("England", "GBP");
        currencies.put("Canada", "CAD");
        currencies.put("HongKong", "HKD");
        currencies.put("Australia", "AUD");

        // Synchronizing HashMap in Java
        currencies = Collections.synchronizedMap(currencies);
        // Make sure to synchronize Map while Iterating
        // getting key set can be outside synchronized block
        Set<String> keySet = currencies.keySet();

        synchronized (currencies) {
//        Set<String> keySet = currencies.keySet();
         Iterator<String> itr = keySet.iterator();
         while (itr.hasNext()) {
          System.out.println("synchronized "+ itr.next());
         }
        }
        
        
        collectionViewsDemo();
        
        multmapDemo();
        forEachWithMap();
        
    }
}