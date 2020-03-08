package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream ops = new ObjectOutputStream(fos);
		
		
		Employee emp = new Employee(10, "PPP", "Surat");
		System.out.println(emp);
		ops.writeObject(emp);
		
		ops.close();
		readAsObject();
	}

	public static void readAsObject() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee e = (Employee) obj;
		System.out.println(e.toString());
		ois.close();
		
	}
}
