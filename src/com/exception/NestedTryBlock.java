package com.exception;

public class NestedTryBlock {

	public static void main(String args[]) {
		try {
			try {
				System.out.println(" This gives divide by zero error");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				System.out.println(" This gives Array index out of bound exception");
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");
	}
}