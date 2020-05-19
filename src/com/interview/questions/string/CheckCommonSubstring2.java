package com.interview.questions.string;

import java.util.Arrays;

/**
 * 
 * @author mrityunjaykumar
 *
 */
public class CheckCommonSubstring2 {
	
    public static int MAX_CHAR_LENGTH = 26; 
    public static boolean checkSubstring(String s1, String s2) { 
        boolean tempRes[]=new boolean[MAX_CHAR_LENGTH]; 
        Arrays.fill(tempRes,false); 
      
        for (int i = 0; i < s1.length(); i++) {
        	tempRes[s1.charAt(i) - 'a'] = true; 
        }
        for (int i = 0; i < s2.length(); i++)   {
        	if (tempRes[s2.charAt(i) - 'a']) {
            	return true; 
            }
        }
        return false;      
    } 
      
    public static void main (String[] args)  { 
    	String []str = {"ab","cd", "ef"};
		String str2[] = {"af", "ee","ef"};
		
		for(int i = 0; i < str.length; i++) {
			boolean res = checkSubstring(str[i], str2[i]);
			if(res) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
      
    } 
} 