package com.interview.questions;

public class BinarySearchRotationArray {
	
	
	public static void searchElementusingBinarySearch(int arr[], int element) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low < high) {
			int mid = (low + high)/2;
			if(arr[mid] > element && arr[low] <= element) {
				high = mid - 1;
			} else if (arr[mid] == element) {
				System.out.println("Element found at: " + mid);
				return;
			} else {
				low = mid + 1;
			}
		}
		
		System.out.println("Element Not found");
	}

	public static void main(String[] args) {
		
		int arr[] = {5,6,7,1,2,3,4};
		
		BinarySearchRotationArray.searchElementusingBinarySearch(arr, 4);
	}

}
