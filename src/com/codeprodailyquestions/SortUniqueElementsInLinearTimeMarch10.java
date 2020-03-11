package com.codeprodailyquestions;

/**
 * Given a list of numbers with only 3 unique numbers (1, 2, 3), sort the list in O(n) time.

	Example 1:
	Input: [3, 3, 2, 1, 3, 2, 1]
	Output: [1, 1, 2, 2, 3, 3, 3]
	
	Challenge: Try sorting the list using constant space.

 * @author mrityunjaykumar
 *
 */
public class SortUniqueElementsInLinearTimeMarch10 {
	
	private static int[] sortArray(int arr[]) {
		
		int x1 = 0, x2 = 0, x3 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				x1++;
			}
			if(arr[i] == 2) {
				x2++;
			}
			if(arr[i] == 3) {
				x3++;
			}
		}
		
		int index = 0;
		for(int i = 0; i < x1; i++) {
			arr[index++] = 1;
		}
		for(int i = 0; i < x2; i++) {
			arr[index++] = 2;
		}
		for(int i = 0; i < x3; i++) {
			arr[index++] = 3;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int arr[] = {3, 3, 2, 1, 3, 2, 1};
		int result[] = sortArray(arr);
		
		for (int i : result) {
			System.out.print(i+" ");
		}
		
	}

}
