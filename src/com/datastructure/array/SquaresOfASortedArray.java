package com.datastructure.array;

import java.util.Arrays;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array
 * of the squares of each number, also in sorted non-decreasing order.
 * 
 * Example 1:
 * 
 * Input: [-4,-1,0,3,10] Output: [0,1,9,16,100]
 * 
 * @author mrityunjayk
 *
 */
public class SquaresOfASortedArray {

	public static int[] sortedSquares(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}

		Arrays.sort(nums);
		return nums;
	}

	public static void main(String[] args) {
		int arr[] = { -4, -1, 0, 3, 10 };
		int result[] = sortedSquares(arr);
		for(int v: result) {
			System.out.print(v+" ");
		}
		
	}

}
