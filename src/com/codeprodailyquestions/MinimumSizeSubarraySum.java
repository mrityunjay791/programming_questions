package com.codeprodailyquestions;

/**
 * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 *
 *	Example:
 *	Input: s = 7, nums = [2,3,1,2,4,3]
 *	Output: 2
 *	Explanation: the subarray [4,3] has the minimal length under the problem constraint.
 *
 * @author mrityunjaykumar
 *
 */
public class MinimumSizeSubarraySum {
	
	private static int findSubArray(int arr[], int s) {
		
		int min = arr.length;
		int l = 0;
		int h = 0;
		boolean isFound = false;
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			int j = i;
			for( ; j < arr.length; j++) {
				sum += arr[j];
				if(sum >= s) {
					isFound = true;
					break;
				}
			}
			
			
			if(min > j - i + 1 && isFound) {
				min = j - i + 1;
				l = i;
				h = j;
			}
			
			
		}
		
		
		System.out.print("[ ");
		for(int k = l; k <= h && isFound; k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.print("]");
		
		return !isFound ? 0 : min;
	}

	public static void main(String[] args) {
		int arr[] = {2,3,1,2,4,3};
		int s = 60;
		System.out.println("\nMinimum length: "+findSubArray(arr, s));
		
	}

}
