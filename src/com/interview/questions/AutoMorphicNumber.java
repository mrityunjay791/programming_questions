package com.interview.questions;

import java.util.Scanner;

/**
 * A number is an AutoMorphic if its square ends with the same digit as the original number.
 * 
 * @author mrityunjaykumar
 *
 */
public class AutoMorphicNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int squ = num * num;

		while (num > 0) {
			if (num % 10 != squ % 10) {
				System.out.println("Not Auto morphic number");
				return;
			}

			num /= 10;
			squ /= 10;
		}

		System.out.println("Auto morphic number");

		sc.close();
	}

}
