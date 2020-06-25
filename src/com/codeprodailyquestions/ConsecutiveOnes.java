package com.codeprodailyquestions;

import java.util.Scanner;

/**
 * Return the longest run of 1s for a given integer n's binary representation.
 * 
 * Example: Input: 242 Output: 4 242 in binary is 0b11110010, so the longest run
 * of 1 is 4.
 * 
 * @author mrityunjaykumar
 *
 */
public class ConsecutiveOnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		int arr[] = new int[64];
		int i = 0;
		while (num > 0) {
			arr[i++] = num % 2;
			num = num / 2;
		}

		int size = 0;
		
		
		for (int k = 0; k < i; k++) {
			System.out.print(arr[k] + " ");
			if(arr[k] == 1) {
				for(int p = k; p < i; p++) {
					if(arr[p] == 0) {
						if((p - k) > size) {
							System.out.println("\n"+p +" "+ k);
							size = p - k;
						}
					}
				}
			}
			
			
		}
		System.out.print(" "+ size);
		sc.close();
	}

}
