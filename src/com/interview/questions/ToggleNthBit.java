package com.interview.questions;

import java.util.Scanner;

public class ToggleNthBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int nthValue = sc.nextInt();

		num = num ^ 1 << nthValue - 1;
		
		
		System.out.println(num);

		sc.close();
	}

}
