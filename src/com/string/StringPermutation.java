package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		permute(str, 0, str.length() - 1);

	}

	public static void permute(String str, int l, int r) {
		Integer []arr = { 1, 2, 3, 4, 5 };

		List<Integer> list = Arrays.asList(arr);

		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);

				str = swap(str, l, i);
			}
		}
	}

	public static String swap(String str, int i, int j) {
		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}

}
