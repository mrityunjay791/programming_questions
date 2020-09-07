package com.leetcode.practice.interview.basic;

/**
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * 
 * Follow up:
 * 
 * Try to come up as many solutions as you can, there are at least 3 different
 * ways to solve this problem. Could you do it in-place with O(1) extra space?
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4] Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to the right:
 * [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * 7, 6, 5, 4, 3, 2, 1 5, 6, 7, 4, 3, 2, 1 5, 6, 7, 1, 2, 3, 4
 * 
 * @author mrityunjayk
 *
 */
public class RotateArray {

	public static void rotate(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			int lastNum = nums[nums.length - 1];
			for (int j = nums.length - 1; j > 0; j--) {
				nums[j] = nums[j - 1];
			}
			nums[0] = lastNum;

		}
	}

	public static void reverse(int start, int end, int arr[]) {

		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void rotateArrayByReversing(int nums[], int k) {
		reverse(0, nums.length - 1, nums); // n/2 times
		reverse(0, k - 1, nums); // k / 2 times
		reverse(k, nums.length - 1, nums); // (n - k) / 2 times
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

//		rotate(nums, k); // O(n * k)

		rotateArrayByReversing(nums, k);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
