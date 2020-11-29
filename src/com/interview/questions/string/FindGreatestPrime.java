package com.interview.questions.string;

public class FindGreatestPrime {

	public static boolean checkPrime(int num) {
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i){
            if(num % i == 0){
                flag = true;
                break;
            }
        }

        return !flag;
	}
	public static void main(String[] args) {
		String str = "6158";
		char arr[] = str.toCharArray();
		int result = 1;
		for(int i = 0; i < arr.length; i++) {
			if(checkPrime(arr[i]-48) && (arr[i] - 48) > result) {
				result = arr[i] - 48;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			String tempStr = ""+arr[i];
			for(int j = i + 1; j < arr.length; j++) {
				String strValue = tempStr+arr[j];
				int val = Integer.parseInt(strValue);
				if(checkPrime(val) && val > result) {
					result = val;
				}
			}
		}
		
		System.out.println("Greatest prime no from the substring "+ str + " is " +result);
	}

}
