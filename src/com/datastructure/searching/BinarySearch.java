package com.datastructure.searching;

/**
 * Binary Search Implementation.
 * 
 * @author mrityunjaykumar
 *
 */
public class BinarySearch {

	private static boolean binarySearch(int arr[], int element) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (arr[mid] == element) {
				return true;
			} else if (arr[mid] < element) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return false;
	}

	private static boolean binarySearchRecursively(int arr[], int low, int high, int element) {
		int mid = low + (high - low) / 2;
		if (low > high) {
			return false;
		}
		if (arr[mid] == element) {
			return true;
		} else if (arr[mid] < element) {
			return binarySearchRecursively(arr, mid + 1, high, element);
		} else {
			return binarySearchRecursively(arr, low, mid - 1, element);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 6, 8, 9, 10, 12, 14, 16 };

		boolean result = binarySearch(arr, 12);
		boolean resultRecursive = binarySearchRecursively(arr, 0, arr.length - 1, 12);
		System.out.println("Recursive result: " + resultRecursive);

		if (result) {
			System.out.println("Element found..");
		} else {
			System.out.println("Element Not found..");
		}

	}

}
