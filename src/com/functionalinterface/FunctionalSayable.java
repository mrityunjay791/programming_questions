package com.functionalinterface;

public class FunctionalSayable implements Sayable {

	public static void main(String[] args) {
		
		Sayable sayable = (msg) -> {
			System.out.println("Print msg: "+msg);
		};
		
		sayable.say("Hello function interface...!");
	}

	@Override
	public void say(String msg) {
		System.out.println("Hello function interface...!");
	}

}
