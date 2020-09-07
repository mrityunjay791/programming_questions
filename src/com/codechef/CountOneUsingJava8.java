package com.codechef;

import java.util.Arrays;

public class CountOneUsingJava8 {

	public static int countOne(int arr[]) {
		int count = (int) Arrays.stream(arr).filter(item -> item == 1).count();
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 1 };
		System.out.println(countOne(arr));
	}

}
