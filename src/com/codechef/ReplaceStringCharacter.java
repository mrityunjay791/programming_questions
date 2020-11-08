package com.codechef;

import java.util.Arrays;

public class ReplaceStringCharacter {
	
	
	static String random(char ch1, char ch2) {
		char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 
                'h', 'i', 'j', 'k', 'l', 'm', 'n',  
                'o', 'p', 'q', 'r', 's', 't', 'u', 
                'v', 'w', 'x', 'y', 'z' };
		int index = 0;
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] != ch1 && alphabet[i] != ch2) {
				index = i;
			}
		}
		return ""+alphabet[index];
	}
	
	static int stringReplaceCharacter(String str, int k, int len) { 	
        StringBuffer sb = new StringBuffer(str);
        for(int j = 0; j < k; j++) {
        	for(int i = 0 ; i < len - 1; i++) {
            	if(sb.charAt(i) != sb.charAt(i+1)) {
            		sb.replace(i, i+2, random(sb.charAt(i), sb.charAt(i+1)));
            	}
            }
        }
        
        return sb.length();
        
    } 
  
    public static void main(String[] args) { 
        String str = "aabc"; 
        int len = 4;
        int k = 1;
        System.out.println(stringReplaceCharacter(str, k, len)); 
    } 
}
