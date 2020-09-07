package com.leetcode.practice.interview.basic;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each
 * element appear only once and return the new length. Do not allocate extra
 * space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 * @author mrityunjayk
 *
 */
public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {

		int countLen = 0;
		int currNum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (currNum != nums[i]) {
				currNum = nums[i];
				nums[countLen] = nums[i];
				countLen++;
			}
		}
		return countLen;
	}

	public static void main(String[] args) {
		int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		// nums is passed in by reference. (i.e., without making a copy)
		int len = removeDuplicates(nums);

		// any modification to nums in your function would be known by the caller.
		// using the length returned by your function, it prints the first len elements.
		for (int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
