package com.interview.questions;

import java.util.Scanner;

public class FindNonRepeatedEle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int temp = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			temp = temp ^ arr[i];
		}
		
		
		System.out.println(temp);
		
		sc.close();
	}

}
