package com.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ExceptionHandlingWorks {

	public static int show() {
		try {
			System.out.println("Try block");
    		return 1;
    	} catch(Exception e) {
    		System.out.println("Catch block");
    		return 2;
    	} finally {
    		System.out.println("Finally block");
    	}
	}
    public static void main(String[] args) {
    	
//    	System.out.println("Method1"+ show());
    	
    	exceptionHandler();
    	System.out.println("Method1"+ show());
  
        
    }

    private static void exceptionWithoutHandler() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("/invalid/file/location")))) {
             int c;
             // Read and display the file.
             while ((c = reader.read()) != -1) {
                 System.out.println((char) c);
             }
        }
    }

    private static void exceptionWithoutHandler1() throws IOException {
//    	System.out.println("exceptionWithoutHandler1");
        exceptionWithoutHandler();
    }

    private static void exceptionWithoutHandler2() throws IOException {
//    	System.out.println("exceptionWithoutHandler2");
//    	try {
    		 exceptionWithoutHandler1();
//    	}
//    	catch (IOException e) {
//            System.out.println("IOException caught2...!!");
//       }
       
    }

    private static void exceptionHandler() {
    	
        try {
             exceptionWithoutHandler2();
        } catch (IOException e) {
             System.out.println("IOException caught!"+ e);
        }
    }
    
}