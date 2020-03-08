package com.java.oops.abstractandinterface.copy;
interface AbstractShape{
    abstract void draw();
    
    abstract void showSize();
   
    
}


//The abstract method draw in type Shape can only be defined by an abstract class
abstract class Shape implements AbstractShape{

	private String message;
    public void draw() {
    	
    }
    

        
    public Shape(String message) {
    	this.message = message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
    
    
}

class Circle extends Shape {

	public Circle(String message) {
		super(message);
	}

	@Override
	public void showSize() {
		System.out.println("Show Size");
	}
	
	
	
}