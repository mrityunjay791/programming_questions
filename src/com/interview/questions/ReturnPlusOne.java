package com.interview.questions;

import java.util.Scanner;

public class ReturnPlusOne {

	public static int calculate(int arr[]) {
		int sum = 0;
		for(int x: arr) {
			sum += x + 1;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(calculate(arr));
		sc.close();
	}

}
