package com.oops;

public class StudentCloneableMain {

	public static void main(String[] args) {
		
		StudentCloneable s = new StudentCloneable(10, "Ankit");
		
		try {
			StudentCloneable s2 = (StudentCloneable) s.clone();
			
			System.out.println(s2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
