package com.codeprodailyquestions;

import java.util.Arrays;

/**
 * You are given an array of integers. Return the largest product that can be made by multiplying any 3 integers in the array.
 *
 * Example:
 *
 * [-4, -4, 2, 8] should return 128 as the largest product can be made by multiplying -4 * -4 * 8 = 128.
 * 
 * @author mrityunjaykumar
 *
 */
public class LargestProductOfThreeElement {
	
	private static int getMaxOfThreeElement(int arr[]) {
		Arrays.sort(arr);
		
		int res1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
		int res2 = arr[0] * arr[1] * arr[arr.length - 1];
		
		return res1 > res2 ? res1 : res2;
	}

	public static void main(String[] args) {
		int arr[] = {-4, -4, 2, 8};
		System.out.println(getMaxOfThreeElement(arr));
		
	}

}
