package com.codeprodailyquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * Given a string, find the length of the longest substring without repeating
 * characters.
 *
 * Here is an example solution in Python language. (Any language is OK to use in
 * an interview, though we'd recommend Python as a generalist language utilized
 * by companies like Google, Facebook, Netflix, Dropbox, Pinterest, Uber, etc.,)
 * 
 * @author mrityunjaykumar
 *
 */
public class LongestSubStringWithoutRepeatingCharacter {

	private static boolean check(String str, int low, int high) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = low; i <= high; i++) {

			if (map.containsKey(str.charAt(i))) {
				return false;
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		int max = 0;
		int startIndex = 0;
		int len = str.length();
		
		if (len < 2) {
			System.out.println(str);
			sc.close();
			return;
			
		}
		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len; j++) {
				boolean isValid = check(str, i, j);

				if (isValid && j - i > max) {
					max = j - i;
					startIndex = i;
				}
			}
		}

		System.out.println(str.substring(startIndex, startIndex + max + 1));
		System.out.println(max + 1);
		sc.close();
	}

}
