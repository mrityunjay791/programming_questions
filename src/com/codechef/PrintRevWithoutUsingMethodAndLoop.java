package com.codechef;

public class PrintRevWithoutUsingMethodAndLoop {

	public static void printRev(int arr[], int counter) {
		if (arr.length == counter) {
			return;
		}

		int val = arr[counter];
		printRev(arr, counter + 1);
		System.out.print(val + " ");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		printRev(arr, 0);
	}

}
