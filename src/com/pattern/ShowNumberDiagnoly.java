package com.pattern;

import java.util.Scanner;

public class ShowNumberDiagnoly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");

		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("1 ");
			}
			System.out.print(i);
			System.out.println();
		}
		
		sc.close();
	}

}
