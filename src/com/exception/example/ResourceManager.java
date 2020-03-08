package com.exception.example;

public class ResourceManager {

	public Resource getResource(int resourceId) throws ResourceNotFoundExeption {
		
		if(resourceId == 10) {
			return new Resource(resourceId);
		} else {
			throw new ResourceNotFoundExeption("Resource not found with id ::" + resourceId);
		}
		
	}
}
