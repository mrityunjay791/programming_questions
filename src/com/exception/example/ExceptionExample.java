package com.exception.example;


public class ExceptionExample {

	public static void main(String[] args) {
		ResourceManager manager = new ResourceManager();
		
		Resource resource = null;
		try {
			resource = manager.getResource(0);
		} catch (ResourceNotFoundExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(resource);
	}

}
