package com.datastructure.array;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of
 * zero, shifting the remaining elements to the right.
 * 
 * Input: [1,0,2,3,0,4,5,0] Output: null Explanation: After calling your
 * function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * 
 * @author mrityunjayk
 *
 */
public class DuplicateZeros {

	public static void duplicateZeros(int nums[]) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 0) {
				for (int j = nums.length - 1; j > i; j--) {
					nums[j] = nums[j - 1];
				}

				nums[i + 1] = 0;
				i++;
			}
		}

		for (int value : nums) {
			System.out.print(value + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
		duplicateZeros(arr);
	}

}
