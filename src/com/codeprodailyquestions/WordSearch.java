package com.codeprodailyquestions;

/**
 * You are given a 2D array of characters, and a target string. Return whether or not the word target word exists in the matrix. 
 * Unlike a standard word search, the word must be either going left-to-right, or top-to-bottom in the matrix.
 *
 *	Example:
 *	
 *	[['F', 'A', 'C', 'I'],
 *	 ['O', 'B', 'Q', 'P'],
 *	 ['A', 'N', 'O', 'B'],
 *	 ['M', 'A', 'S', 'S']]
 *	
 *	Given this matrix, and the target word FOAM, you should return true, as it can be found going up-to-down in the first column.
 *
 * @author mrityunjaykumar
 *
 */
public class WordSearch {

	private static boolean checkWord(char arr[][], int i, int j, char chArr[]) {
		
		StringBuffer sb = new StringBuffer();
		for(int ir = i; ir < arr.length && sb.length() < chArr.length; ir++) {
			sb.append(arr[ir][j]);
		}
		
		if(sb.toString().equals(new String(chArr))) {
			return true;
		} else {
			sb = new StringBuffer();
			for(int jr = j; jr < arr[i].length && sb.length() < chArr.length; jr++) {
				sb.append(arr[i][jr]);
			}
			return sb.toString().equals(new String(chArr));
		}
	}
	
	public static void main(String[] args) {
		
		char [][]arr = {
				{'F', 'A', 'C', 'I'},{'O', 'B', 'Q', 'P'},{'A', 'N', 'O', 'B'},{'M', 'A','S','S'}
		};
		
		String str = "BQ";
		boolean isFound = false;
		char tempArr[] = str.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(tempArr[0] == arr[i][j]) {
					isFound = checkWord(arr, i, j,tempArr);
					if(isFound) {
						System.out.println("TRUE");
						break;
					}
				}
			}
			
			if(isFound) {
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("FALSE");
		}
		
		
		
	}

}
