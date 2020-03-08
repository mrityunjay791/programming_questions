package com.exception;

public class InfiityQException {

	public void checkExep(int num1, int num2) {
		int arr[] = {1,2,3};
		String str = null;
		System.out.println("Befor exception.." + Math.random());
		try {
			str.charAt(0);
			System.out.println(num1/num1);
			System.out.println("Enjoy no exception..");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception handler..");
		} catch (NullPointerException e) {
			System.out.println("Null pointer exceptions handler..");
		} catch(Exception e) {
			System.out.println("Default exp handler");
		}
		finally {
			System.out.println("Finally block..");
		}
		System.out.println("After handling exception..");
	}
	public static void main(String[] args) {
		InfiityQException obj = new InfiityQException();
		try {
			obj.checkExep(2, 3);
		} catch (ArithmeticException e) {
			System.out.println("Arithemtic exception handler in main method..");
		}
		
		System.out.println("End of main method..");
	}

}
