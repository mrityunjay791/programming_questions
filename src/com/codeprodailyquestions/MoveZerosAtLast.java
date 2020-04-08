package com.codeprodailyquestions;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 *
 * Example: Input: [0,1,0,3,12] Output: [1,3,12,0,0] You must do this in-place
 * without making a copy of the array. Minimize the total number of operations.
 *
 *
 * @author mrityunjaykumar
 *
 */
public class MoveZerosAtLast {

	/**
	 * Move zeros at last by using temporary array.
	 * 
	 * @param arr
	 * @return
	 */
	private static int[] moveZeros(int arr[]) {
		int temp[] = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp[k++] = arr[i];
			}
		}

		for (int i = k; i < arr.length; i++) {
			temp[i] = 0;
		}

		return temp;

	}

	/**
	 * Move zeros at last in by sifting positions with O(n) complexity.
	 * 
	 * @param arr
	 * @return
	 */
	private static int[] moveZerosAtLastInOneSift(int arr[]) {

		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[k++] = arr[i];
				arr[i] = 0; //used for inserting zeros.
			}
		}

//		for (int i = k; i < arr.length; i++) {
//			arr[i] = 0;
//		}
		
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 0, 0, 0 , 1, 0, 3, 0, 4, 0, 0, 12 };
		
		System.out.println("Without using extra memory space: ");
		int temp[] = moveZerosAtLastInOneSift(arr);
		for (int val : temp) {
			System.out.print(val + " ");
		}
		
		System.out.println("\nUsing extra memory space: ");
		int temp2[] = moveZeros(arr);
		for (int val : temp2) {
			System.out.print(val + " ");
		}
	}

}
