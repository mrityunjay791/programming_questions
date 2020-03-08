package com.recurssion;

import java.util.Scanner;

public class RecurssiveExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println("\nResuls: "+display(arr, 0, n-1));
		displayHalf(arr, 0, n-1);
//		showTable(n, 1);
		sc.close();
	}
	
	
	public static int display(int arr[], int startIndex, int len) {
		if(startIndex == len) {
			return arr[startIndex];
		} else {
			return arr[startIndex] * display(arr, startIndex + 1, len);
		}
	}

	public static void displayHalf(int arr[], int startIndex, int len) {
		if(startIndex <= len/2) {
			if(startIndex > len/2) {
				return;
			} else {
				displayHalf(arr, startIndex + 1, len);
				System.out.print(arr[startIndex]+" ");
			}
		} else {
			if(startIndex > len) {
				return;
			} else {
				displayHalf(arr, startIndex + 1, len);
				System.out.print(arr[startIndex]+" ");
			}
		}
		
	}
	
	public static void showTable(int num, int counter) {
		if(counter == 10) {
			System.out.println(num + " * "+ counter +" = "+ num*counter);
		} else {
			System.out.println(num + " * "+ counter +" = "+ num*counter);
			showTable(num, counter + 1);
			
		}
		
	}
}
