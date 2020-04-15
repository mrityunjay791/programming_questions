package com.codeprodailyquestions;

import java.util.Arrays;

/**
 * You are given an array of integers. Return the smallest positive integer that
 * is not present in the array. The array may contain duplicate entries.
 *
 * For example, the input [3, 4, -1, 1] should return 2 because it is the
 * smallest positive integer that doesn't exist in the array.
 *
 * Your solution should run in linear time and use constant space.
 * 
 * @author mrityunjaykumar
 *
 */
public class FirstMissingPositiveInteger {

	private static int findSmallestPositiveInteger(int arr[]) {
		int min = 0;

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] - min > 1) {
				return min + 1;
			} else if (arr[i] > 0) {
				min = arr[i];
			}
		}
		return min + 1;

	}

	public static void main(String[] args) {

		int arr[] = { 5, 6, -1, 3, 4, 1 };

		System.out.println("Result: " + findSmallestPositiveInteger(arr));
	}

}
