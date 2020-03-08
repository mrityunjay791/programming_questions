package com.exception.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryWithResourceExample {
	public static void main(String s[]) {
		// note the order of opening the resources

		try {
			runtimeNullPointerException();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try {
			uncheckedException();
		} catch (FileNotFoundException | ArrayIndexOutOfBoundsException e1) {
			System.out.println("File not found "+ e1);
		}
		
		try ( ResourceDemo1 d1 = new ResourceDemo1(); ResourceDemo d = new ResourceDemo();) {
			int x = 10 / 0;
			d.show();
			d1.show1();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	private static void uncheckedException() throws FileNotFoundException {
	    File file = new File("not_existing_file.txt");
	    FileInputStream stream = new FileInputStream(file);
	}
	
	public  static void runtimeNullPointerException() {
	    String a = null;
	    a.length();
	}
}

// custom resource 1
class ResourceDemo implements AutoCloseable {
	void show() {
		System.out.println("inside show");
	}

	public void close() {
		System.out.println("close from resourcedemo");
	}
}

// custom resource 2
class ResourceDemo1 implements AutoCloseable {
	void show1() {
		System.out.println("inside show1");
	}

	public void close() {
		System.out.println("close from resourcedemo1");
	}
}