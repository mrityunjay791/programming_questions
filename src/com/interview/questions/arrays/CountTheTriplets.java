package com.interview.questions.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Given an array of distinct integers. The task is to count all the triplets 
 * such that sum of two elements equals the third element.
 * 
 * @author mrityunjaykumar
 *
 */
public class CountTheTriplets {

	/**
	 * Counting pair.
	 * 
	 * @param arr
	 * @param n
	 * @param map
	 * @return
	 */
	public static int countTriplets(int arr[], int n, Map<Integer, Integer> map) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (map.containsKey(arr[i] + arr[j])) {
					count++;
				}
			}
		}

		return count;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
		
		System.out.println("Enter array elemnts: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			map.put(arr[i], arr[i]);
		}
		int count = countTriplets(arr, n, map);
		if (count > 0) {
			System.out.println(count);
		} else {
			System.out.println("-1");
		}

		sc.close();
	}

}
