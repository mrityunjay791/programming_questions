package com.codeprodailyquestions;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *
 *	Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *	
 *	Note: You are not suppose to use the library’s sort function for this problem.
 *	
 *	Can you do this in a single pass?
 *	
 *	Example:
 *	Input: [2,0,2,1,1,0]
 *	Output: [0,0,1,1,2,2]
 *
 * @author mrityunjaykumar
 *
 */
public class SortColors {
	
	
	/**
	 * Sort color in O(n)
	 * 
	 * @param arr
	 */
	public static void sortColors(int arr[]) {
		int n = arr.length;
		int red = 0;
		int white=0;
		int blue= 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0)
				red++;
			if(arr[i] == 1)
				white++;
			if(arr[i] == 2)
				blue++;
		}
		
		for(int i = 0; i < red; i++) {
			arr[i] = 0;
		}
		
		for(int i = red; i < red+white; i++) {
			arr[i] = 1;
		}
		for(int i = red+white; i < red+white+blue; i++) {
			arr[i] = 2;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {2,0,2,1,1,0};
		sortColors(arr);
	}

}
