package com.techelevator;

public class Car extends Automobile implements Vehicle {

	public Car(String name, double distance) {
		super("Car1", distance);
	}

	public double calculatedToll() {

		rate = distance * 0.020;

		return rate;
	}

}
