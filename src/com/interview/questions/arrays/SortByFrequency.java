package com.interview.questions.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Sort array by element frequency.
 * 
 * @author mrityunjaykumar
 *
 */
public class SortByFrequency {

	public static void displayElement(int n, int val) {
		for (int i = 0; i < n; i++) {
			System.out.print(val + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 5, 4 , 4, 4, 5, 7 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

	
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o2.getValue()) - (o1.getValue());
			}
		});
		
		
		list.forEach(item -> {
			displayElement(item.getValue(),item.getKey());
		});

	}

}
