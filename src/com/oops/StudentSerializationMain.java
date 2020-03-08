package com.oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerializationMain {

	public static void main(String[] args) {
		String path = "student.txt";
		StudentSerialization s1 = new StudentSerialization(1002, "Rohan");
		
		try {
			FileOutputStream out = new FileOutputStream(path);
			ObjectOutputStream objectOut = new ObjectOutputStream(out);
			
			objectOut.writeObject(s1);
			objectOut.flush();
			objectOut.close();
			
			FileInputStream input = new FileInputStream(path);
			ObjectInputStream objectInput = new ObjectInputStream(input);
			
			StudentSerialization s2 = (StudentSerialization) objectInput.readObject();
			System.out.println(s2.getName() + " : "+ s2.getRoll());
			objectInput.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
