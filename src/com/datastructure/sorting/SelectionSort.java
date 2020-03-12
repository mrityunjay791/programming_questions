package com.datastructure.sorting;

/**
 * Implemented Selection sort..
 * 
 * @author mrityunjaykumar
 *
 */
public class SelectionSort {

	/**
	 * This method is used for sorting array.
	 * 
	 * @param arr
	 * @return
	 */
	private static int[] selectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 8, 34, 2, 4, 1, 12 };

		arr = selectionSort(arr);
		System.out.println("Selection sort: ");
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

}
