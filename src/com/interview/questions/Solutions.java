package com.interview.questions;

import java.util.Scanner;

/**
 * 
 * @author mrityunjaykumar
 *
 */
public class Solutions {
	
	public static void calculateNoOfProduct(int val) {
		int sum = 0;
		while(val > 0) {
			sum = sum + (val % 10);
			val = val / 10;
		}
		
		System.out.print(sum+" ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			calculateNoOfProduct(arr[i]);
		}
		
		sc.close();
	}

}
