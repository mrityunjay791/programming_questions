package com.codeprodailyquestions;

import java.util.Scanner;

/**
 * In many spreadsheet applications, the columns are marked with letters. From the 1st to the 26th column the letters are A to Z. Then starting from the 27th column it uses AA, AB, ..., ZZ, AAA, etc.
 *
 * Given a number n, find the n-th column name.
 *
 * @author mrityunjaykumar
 *
 */
public class SpreadSheetColumns {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any n-th value: ");
		int n = sc.nextInt();
		if(n % 26 == 0) {
			for(int i = 0; i < (n / 26) - 1; i++) {
				System.out.print("A");
			}
		} else {
			for(int i = 0; i < n / 26; i++) {
				System.out.print("A");
			}
		}
			
	
		n = n % 26;
		
		if(n > 0) {
			System.out.print((char)(64 + n % 26));
		} else {
			System.out.print("Z");
		}
		
		sc.close();
	}

}
