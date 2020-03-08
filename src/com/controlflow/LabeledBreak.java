package com.controlflow;

public class LabeledBreak {

	public static void main(String[] args) {

		int[][] table = { { 1, 2, 3 }, { 25, 37, 49 }, { 55, 68, 93 } };
		boolean found = false;
		int loopCycles = 0;
		 
		outer: for (int[] rows : table) {
		    for (int row : rows) {
		        loopCycles++;
		        if (row == 37) {
		            found = true;
		            break outer;
		        }
		    }
		}
		
		System.out.println(found+" "+ loopCycles);
	}

}
