package com.codeprodailyquestions;

import java.util.HashMap;
import java.util.Map;

/**
 *  Given a list of numbers, find if there exists a pythagorean triplet in that list. A pythagorean triplet is 3 variables a, b, c where a2 + b2 = c2
 *
 *	Example:
 *	Input: [3, 5, 12, 5, 13]
 *	Output: True
 *	Here, 5^2 + 12^2 = 13^2.
 *
 * @author mrityunjaykumar
 *
 */
public class FindPythagoreanTriplets {
	
	private static boolean findTriplets(int arr[], int n) {
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(arr[i] * arr[i])) {
				map.put(arr[i] * arr[i], arr[i]);
			}
		}
		
		for(int i = 0; i < n; i++) {
			int x = arr[i] * arr[i];
			
			for(int j = i + 1; j < n; j++) {
				int y = arr[j] * arr[j];
				
				if(map.containsKey(x + y)) {
					System.out.println(arr[i] + "^2 + " + arr[j] + "^2 = " + map.get(x + y) + "^2");
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int arr[] = {3, 5, 12, 5, 13};
		
		boolean result = findTriplets(arr, arr.length);
		
		System.out.println("Is pythogorean triplet available: "+ result);
	}

}
