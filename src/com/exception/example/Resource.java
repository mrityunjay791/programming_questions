package com.exception.example;

public class Resource {

	private int resourceId;

	public Resource(int resourceId) {
		super();
		this.resourceId = resourceId;
	}

	@Override
	public String toString() {
		return "Resource [resourceId=" + resourceId + "]";
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

}
