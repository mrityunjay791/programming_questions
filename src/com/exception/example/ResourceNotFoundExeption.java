package com.exception.example;

public class ResourceNotFoundExeption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ResourceNotFoundExeption(Object objectId) {
		super((objectId != null) ? objectId.toString(): null);
	}
	
	

}
