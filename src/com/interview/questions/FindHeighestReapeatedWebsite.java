package com.interview.questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class FindHeighestReapeatedWebsite {
	
	public static void findHeighstRepeated(String arr[]) {
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 0);
			}
		}
		
		TreeSet<String> ts = new TreeSet<>();
		int maxVal = (Collections.max(map.values()));
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			if(maxVal == e.getValue()) {
				ts.add(e.getKey());
			}
		}
		
		System.out.println(ts.first());
	}
	
	public static void main(String str[]) {
		String strArr[] = {"facebook", "google", "facebook", "google"};
		
		findHeighstRepeated(strArr);
	}
	
}
