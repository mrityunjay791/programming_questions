package com.interview.questions.arrays;

import java.util.Scanner;

/**
 * Given an array C of size N-1 and given that there are numbers from 1 to N
 * with one element missing, the missing number is to be found.
 * 
 *  Output:
 *	Print the missing number in array.
 *
 *	Constraints:
 *	1 ≤ T ≤ 200
 *	1 ≤ N ≤ 107
 *	1 ≤ C[i] ≤ 107
 *	
 *	Example:
 *	Input:
 *	2
 *	5
 *	1 2 3 5
 *	10
 *	1 2 3 4 5 6 7 8 10
 *	
 *	Output:
 *	4
 *	9
 *
 * @author mrityunjaykumar
 *
 */
public class FindMissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n - 1];
			for (int i = 0; i < n - 1; i++) {
				arr[i] = sc.nextInt();
			}

			int result = (n * (1 + n)) / 2;
			for (int i = 0; i < n - 1; i++) {
				result -= arr[i];
			}

			System.out.println(result);
		}
		sc.close();
	}

}
