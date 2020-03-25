package com.controlflow;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter any number: ");
		
		byte num = sc.nextByte();
		
		if(num == 0) {
			System.out.println("Hello Sonu..! Your call is recieved..");
		} 
		
		if(num == 1)  {
			System.out.println("Hello Sonu !. Your call is rejected..");
		}
		
		
		
		
	}

}
