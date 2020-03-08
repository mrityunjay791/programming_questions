package com.collection.commonpractice;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int curr = 0;
		String str = "";
		boolean isBreak = false;
		int count = 0;
		for (int i = 1; i <= n; i++) {

			curr -= 1;
			for (int j = 1; j <= i; j++) {

				if (count >= n) {
					isBreak = true;
					break;
				}

				if (i % 2 == 0) {
					curr += 2;
					str = str + curr;
				} else {
					curr += 2;
					str = str + curr;
				}

				count++;
			}

			if (isBreak)
				break;
		}

		System.out.println(str);
		sc.close();
	}

}
