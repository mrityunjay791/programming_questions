package com.codeprodailyquestions;

import java.util.Scanner;

/**
 * You are given a positive integer N which represents the number of steps in a
 * staircase. You can either climb 1 or 2 steps at a time. Write a function that
 * returns the number of unique ways to climb the stairs.
 * 
 * @author mrityunjaykumar
 *
 */
public class NumberOfWaysClimbStairs {

	/**
	 * Using dynamic programming .
	 * 
	 * @param n
	 * @return
	 */
	private static int findWays(int n) {
		if (n == 1) {
            return 1;
        }
		
		int arr[] = new int[n + 1];
		arr[1] = 1;
		arr[2] = 2;

		for (int i = 3; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];
	}

	/**
	 * Using fibonacii method..
	 * 
	 * @param n
	 * @return
	 */
	public static int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = findWays(n);

		System.out.println("No of ways: " + result);
		System.out.println("No of ways: " + climbStairs(n));

		sc.close();
	}

}
