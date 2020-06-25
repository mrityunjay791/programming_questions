package com.interview.questions;

import java.util.Scanner;

/**
 * 
 * @author mrityunjaykumar
 *
 */
public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int arr[] = new int[10];
		int temp[] = new int[10];
		for(int i = 1; i <= 8; i++) {
			arr[i] = sc.nextInt();
		}
		while(m-- > 0) {
			for(int i = 1; i < 9; i++) {
				if((arr[i + 1] == 1 && arr[i - 1] == 0) || (arr[i + 1] == 0 && arr[i - 1] == 1)) {
					temp[i] = 1;
				} else {
					temp[i] = 0;
				}
			}
			
			for(int i = 1; i < 9; i++) {
				arr[i] = temp[i];
			}
		}
		
		for(int i = 1; i < 9; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
		
	}

}
