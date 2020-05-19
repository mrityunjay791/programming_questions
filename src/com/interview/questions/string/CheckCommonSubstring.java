package com.interview.questions.string;

/**
 * 
 * @author mrityunjaykumar
 *
 */
public class CheckCommonSubstring {
	
	public static boolean isValid(String st, String st2) {
		for(int i = 0; i < st.length(); i++) {
			boolean found = st2.contains(""+st.charAt(i));
			if(found) {
				return found;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

		String []str = {"ab","cd", "ef"};
		String str2[] = {"af", "ee","ef"};
		
		for(int i = 0; i < str.length; i++) {
			boolean res = isValid(str[i], str2[i]);
			if(res) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
	}

}
