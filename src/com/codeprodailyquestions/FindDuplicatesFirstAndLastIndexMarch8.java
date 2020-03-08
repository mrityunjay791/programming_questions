package com.codeprodailyquestions;

import java.util.Scanner;

/**
 * Given a sorted array, A, with possibly duplicated elements, find the indices
 * of the first and last occurrences of a target element, x. Return -1 if the
 * target is not found.
 * 
 * Example: Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9 Output: [6,8]
 * 
 * Input: A = [100, 150, 150, 153], target = 150 Output: [1,2]
 * 
 * Input: A = [1,2,3,4,5,6,10], target = 9 Output: [-1, -1]
 * 
 * @author mrityunjaykumar
 *
 */
public class FindDuplicatesFirstAndLastIndexMarch8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter element to find :");
		int ele = sc.nextInt();
		System.out.println("Enter " + n + " array elements :");
		int arr[] = new int[n];

		boolean firstIndexFound = false;
		int result[] = new int[2];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == ele && !firstIndexFound) {
				firstIndexFound = true;
				result[0] = i;
			}

			if (arr[i] != ele && firstIndexFound) {
				result[1] = i - 1;
			}
		}

		if (!firstIndexFound) {
			result[0] = -1;
			result[1] = -1;
		}
		
		for(int val: result) {
			System.out.print(val+" ");
		}
		
		sc.close();
		
	}

}
