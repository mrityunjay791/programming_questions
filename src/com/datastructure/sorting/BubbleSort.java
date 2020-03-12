package com.datastructure.sorting;

/**
 * Implemented bubble sort.
 * 
 * @author mrityunjaykumar
 *
 */
public class BubbleSort {

	private static int[] bubbleSort(int arr[]) {
		
		boolean isSorted = true;
		
		for(int i = 0; i < arr.length - 1 && isSorted; i++ ) {
			isSorted = false;
			for(int j = 0; j < arr.length - i - 1; j++) {
				
				if(arr[j] > arr[j+1]) {
					isSorted = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {8, 34, 2, 4, 1, 12};
		System.out.println("Bubble sort: ");
		arr = bubbleSort(arr);
		
		for(int val: arr) {
			System.out.print(val+" ");
		}
		
	}

}
