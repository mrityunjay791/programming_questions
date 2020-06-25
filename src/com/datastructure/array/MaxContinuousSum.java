package com.datastructure.array;

/**
 * Find maximum continuous sum in an array.
 * 
 * @author mrityunjaykumar
 *
 */
public class MaxContinuousSum {

	public static void main(String[] args) {
		int arr[] = {-2, -3, -4, -1, 2, -1, -5, -3};
		
		int max = Integer.MIN_VALUE;
		int maxEnd = 0;
		
		for(int i = 0; i < arr.length; i++) {
			maxEnd = maxEnd + arr[i];
			
			if(max < maxEnd) {
				max = maxEnd;
			}
			
			if(maxEnd < 0) {
				maxEnd = 0;
			}
			
		}
		
		System.out.println("Maximum continuous sum: "+ max);
	}

}
