package com.oops;

public class Singlton {
	
	private static Singlton singletonObj = null;
	
	private Singlton() {
		System.out.println("Object creation.....!");
	}
	
	public static Singlton getSinglton() {
		if(singletonObj == null) {
			singletonObj = new Singlton();
		}
		
		return singletonObj;
	}

	public static void main(String[] args) {
		Singlton singlton = Singlton.getSinglton();
		System.out.println(singlton);
		Singlton singlton2 = Singlton.getSinglton();
		System.out.println(singlton2);
		Singlton singlton3 = Singlton.getSinglton();
		System.out.println(singlton3);
	}

}
