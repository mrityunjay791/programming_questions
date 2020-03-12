package com.codeprodailyquestions;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * You are given a list of numbers, and a target number k. Return whether or not
 * there are two numbers in the list that add up to k.
 * 
 * Example: Given [4, 7, 1 , -3, 2] and k = 5, return true since 4 + 1 = 5.
 * 
 * Try to do it in a single pass of the list.
 * 
 * @author mrityunjaykumar
 *
 */
public class FindPairWhoseSumEqualToGivenNumberMarch11 {

	private static void findPairInOnePass(int arr[], int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				System.out.println(arr[i] + " + " + map.get(arr[i]) + " = " + k);
				return;
			} else {
				map.put(k - arr[i], arr[i]);
			}
		}

		System.out.println("No pair found..!");
	}

	private static void findPair(int arr[], int k) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (k == arr[i] + arr[j]) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + k);
					return;
				}
			}
		}

		System.out.println("No pair found..!");
	}

	public static void main(String[] args) {

		int arr[] = { 4, 7, 1, -3, 2 };
		int k = 6;
		findPair(arr, k);
		findPairInOnePass(arr, k);
	}

}
