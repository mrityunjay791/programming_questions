package com.datastructure.array;

/**
 * Find Numbers with Even Number of Digits.
 * 
 * @author mrityunjayk
 *
 */
public class FindNumbersWithEvenNumberOfDigits {

	/**
	 * 
	 * @param nums
	 * @return
	 */
	public static int findNumbers(int[] nums) {

		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			int num = nums[i];
			while (num > 0) {
				num /= 10;
				count++;
			}

			if (count % 2 == 0) {
				result++;
			}
		}

		return result;
	}

	
	public static void main(String[] args) {
		int arr[] = { 12, 345, 2, 6, 7896 };

		System.out.println("Result: " + findNumbers(arr));
	}

}
