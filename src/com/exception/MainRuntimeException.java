package com.exception;

public class MainRuntimeException {

	public static void main(String[] args) {

		int result;
		try {
			result = 30 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception"+ e);
		}
		
		
	}

}
