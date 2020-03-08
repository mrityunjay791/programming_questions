package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class DePersist {
	public static void main(String args[]) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		Student s = (Student) in.readObject();
		System.out.println(s.id + " " + s.name + " " + s.age);
		in.close();
	}
}