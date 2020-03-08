package com.string;

public class StringAndStringBufferEqualMethod {

	public static void main(String[] args) {

		String s = new String("Hello");
		String s1 = new String("Hello");
		System.out.println(s + ": " +s1);
		System.out.println(s.equals(s1));
		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb.toString() + ": " +sb1.toString());
		System.out.println(sb.equals(sb1));
	}

}
