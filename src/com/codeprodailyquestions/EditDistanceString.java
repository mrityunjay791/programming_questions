package com.codeprodailyquestions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * Given two strings, determine the edit distance between them. 
 * The edit distance is defined as the minimum number of edits (insertion, deletion, or substitution) needed to change one string to the other.
 *
 * For example, "biting" and "sitting" have an edit distance of 2 (substitute b for s, and insert a t).
 *
 * @author mrityunjaykumar
 *
 */
public class EditDistanceString {
	
	private static void setValueInMap(String str, String str2) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(int i = 0; i < str2.length(); i++) {
			if(map.containsKey(str2.charAt(i))) {
				map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
			}
		}

		int count = 0;
		List<Entry<Character, Integer>> list = map.entrySet().stream().filter(item -> item.getValue() != 0).collect(Collectors.toList());
		for(Entry<Character, Integer> d: list) {
			count = count + ((d.getValue() > 0) ? d.getValue(): 0);
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String str = "biting";
		String str2 = "sitting";
		
		if(str.length() > str2.length()) {
			setValueInMap(str, str2);
		} else {
			setValueInMap(str2, str);
		}
		
	}

}
