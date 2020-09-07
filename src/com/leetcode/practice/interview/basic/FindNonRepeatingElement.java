package com.leetcode.practice.interview.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * Example 1:
 * 
 * Input: [2,2,1] Output: 1 Example 2:
 * 
 * Input: [4,1,2,1,2] Output: 4
 * 
 * @author mrityunjayk
 *
 */
public class FindNonRepeatingElement {

	public static int singleNumber(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		int result = 0;
		for(Map.Entry<Integer, Integer> item: map.entrySet()) {
			if(item.getValue() == 1) {
				result = item.getKey();
				break;
			}
		}
		return result;
	}
	
	
	public static int findSingleNumberUsingBit(int nums[]) {
		int a = 0;
	    for (int i : nums) {
	      a ^= i;
	    }
	    return a;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 1, 2, 1, 2 };
		System.out.println(singleNumber(arr));
		System.out.println("Using bitwise operator: "+findSingleNumberUsingBit(arr));
	}

}
