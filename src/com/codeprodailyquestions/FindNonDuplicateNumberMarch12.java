package com.codeprodailyquestions;

/**
 *  Given a list of numbers, where every number shows up twice except for one number, find that one number.
 *
 *	Example:
 *	Input: [4, 3, 2, 4, 1, 3, 2]
 *	Output: 1
 *
 *  Challenge: Find a way to do this using O(1) memory.
 *
 *  Date: 12/03/2020
 *  
 * @author mrityunjaykumar
 *
 */
public class FindNonDuplicateNumberMarch12 {
	
	/**
	 * Finding non repeated number using XOR operator.
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 * 
	 * @param arr
	 * @return
	 */
	private static int findNonDuplicateNumber(int arr[]) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			result = result ^ arr[i];
		}
		
		return result;
	}
	
	/**
	 * Finding non repeated number using brute force method.
	 * Time Complexity: O(n^2)
	 * Space Complexity: O(1)
	 * 
	 * @param arr
	 * @return 
	 */
	private static int findNonRepeatedNumberUsingBrutForce(int arr[]) {
		int count = 0;
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			count = 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j] && i != j) {
					count++;
				}
			}
			
			if(count == 1) {
				result = arr[i];
				break;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		int arr[] = {4, 3, 2, 4, 1, 3, 2};
		System.out.println("Found non repeated element in this array using XOR operator: "+ findNonDuplicateNumber(arr));
		System.out.println("Found non repeated element in this array using bruth force: "+ findNonRepeatedNumberUsingBrutForce(arr));
		
	}

}
