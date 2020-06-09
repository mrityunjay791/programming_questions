package com.interview.questions.arrays;

import java.util.Scanner;

/**
 * This program states that the number of element should be swapped by given k value.
 * 
 * @author mrityunjaykumar
 *
 */
public class ReverseByGivenKValue {
	
	public static void swapElementByK(int arr[], int low, int high) {
		
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter k value:");
		int k = sc.nextInt();
		int low = 0;
		int high = k - 1;
		
		for(int val: arr) {
			System.out.print(val+" ");
		}
		for(int i = 0; i < (len / k); i++) {
			swapElementByK(arr, low, high);
			low = high + 1;
			high = high + k;
		}
		
		if((arr.length % k) != 0) {
			swapElementByK(arr, low, low + len%k - 1);
		}
		
		System.out.println();
		for(int val: arr) {
			System.out.print(val+" ");
		}
		
		sc.close();
		
	}

}
