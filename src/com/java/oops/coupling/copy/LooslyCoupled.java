package com.java.oops.coupling.copy;

interface Vehicle {
	public void move();
}

class BikeVehicle implements Vehicle {

	@Override
	public void move() {
		System.out.println("Move by Bike..");
	}
	
}

class CarVehicle implements Vehicle {

	@Override
	public void move() {
		System.out.println("Move by Car..");
	}
	
}


class Traveler {
	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void stratJourney() {
		vehicle.move();
	}
	
}

public class LooslyCoupled {
	public static void main(String[] args) {
		Traveler t = new Traveler();
		
		t.setVehicle(new BikeVehicle());
		t.stratJourney();
		t.setVehicle(new CarVehicle());
		t.stratJourney();
	}

}
