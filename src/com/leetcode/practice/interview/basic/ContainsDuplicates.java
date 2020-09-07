package com.leetcode.practice.interview.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * 
 * Your function should return true if any value appears at least twice in the
 * array, and it should return false if every element is distinct.
 * 
 * Example 1: Input: [1,2,3,1] Output: true
 * 
 * Example 2: Input: [1,2,3,4] Output: false
 * 
 * @author mrityunjayk
 *
 */
public class ContainsDuplicates {

	public static boolean checkDuplicates(int arr[]) {
		Arrays.parallelSort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				return true;
			}
		}

		return false;
	}
	
	
	public static boolean checkDuplicatesUsingExtraMemory(int nums[]) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(!set.contains(nums[i])) {
				set.add(nums[i]);
			} else {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1 };
		System.out.println("Duplicate found without sorting: " + checkDuplicatesUsingExtraMemory(arr));
		System.out.println("Duplicate found by using sorting: " + checkDuplicates(arr));
	}

}
