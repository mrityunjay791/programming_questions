package com.codeprodailyquestions;

/**
 * 
 *  There are n people lined up, and each have a height represented as an integer. A murder has happened right in front of them, and only people who are taller than everyone in front of them are able to see what has happened. How many witnesses are there?
 *
 *	Example:
 *	Input: [3, 6, 3, 4, 1]  
 *	Output: 3
 *	Explanation: Only [6, 4, 1] were able to see in front of them.
 * 
 * @author mrityunjaykumar
 *
 */
public class WitnessOfTheTallPeople {

	private static void findWitness(int arr[]) {
		int m = 0;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			
			if(m < arr[i]) {
				m = arr[i];
				System.out.print(m + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3, 6, 3, 4, 1};
		findWitness(arr);
	}

}
