package com.codeprodailyquestions;

/**
 * Given an array, nums, of n integers, find all unique triplets (three numbers,
 * a, b, & c) in nums such that a + b + c = 0. Note that there may not be any
 * triplets that sum to zero in nums, and that the triplets must not be
 * duplicates.
 *
 * Example: Input: nums = [0, -1, 2, -3, 1] Output: [0, -1, 1], [2, -3, 1]
 *
 * @author mrityunjaykumar
 *
 */
public class Find3Sum {

	private static void findTriplet(int arr[], int n) {
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = arr[i];
			for (int j = i + 1; j < n; j++) {
				sum = arr[i] + arr[j];
				for (int k = j + 1; k < n; k++) {
					if (sum + arr[k] == 0) {
						System.out.println("[ " + arr[i] + " , " + arr[j] + " , " + arr[k] + " ]");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1, -2 };
		findTriplet(arr, arr.length);
	}

}
