package com.leetcode.practice.binarysearch;

class BinarySearch {

	public static void main(String s[]) {
		int arr[] = { -1, 0, 3, 5, 9, 12 };
		int searchIndex = search(arr, 9);
		if (searchIndex != -1) {
			System.out.println("Element found at " + searchIndex);
		} else {
			System.out.println("Element Not Found!!");
		}
	}

	public static int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}
}