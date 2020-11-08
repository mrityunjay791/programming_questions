package com.codechef;

public class ProgramToReplaceCharacter {

	public static String replaceCharacter(String str, Character x, Character y) {
		return str.replaceAll(""+x, ""+y);
	}

	public static String replaceCharacterMethod2(String str, Character x, Character y) {
		char arr[] = str.toCharArray();
		str = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				arr[i] = y;
			}
			
			str += arr[i];
		}
		
		return str;
	}

	
	public static void main(String[] args) {
		String str = "abcde";
		Character x = 'b';
		Character y = 'z';
		
		System.out.println("Result: "+ replaceCharacterMethod2(str, x, y));
	}

}
