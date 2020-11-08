package com.datastructure.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Program to find count of max consecutive ones.
 * 
 * @author mrityunjayk
 *
 */
class Solution {

	/**
	 * Finding count of consecutive ones.
	 * 
	 * @param nums
	 * @return count of consecutive ones.
	 */
	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				count = 0;
			}

			if (count > maxCount) {
				maxCount = count;
			}
		}

		return maxCount;
	}
	

	/**
	 * Finding count of consecutive ones using map.
	 * 
	 * @param nums
	 * @return count of consecutive ones.
	 */
	public static int findMaxConsecutiveOnesUsingMap(int[] nums) {
		Map<String, Integer> map = new HashMap<>();
		map.put("result", 0);
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey("1") && nums[i] == 1) {
				map.put("result", map.get("result") + 1);
			} else {
				if (nums[i] == 1) {
					map.put("1", 1);
				} else {
					map.remove("1");
				}

			}
		}

		return map.get("result");
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(arr));
		System.out.println("Result using map: " + findMaxConsecutiveOnesUsingMap(arr));
	}
}