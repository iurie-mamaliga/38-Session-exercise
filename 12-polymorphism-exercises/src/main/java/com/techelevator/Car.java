package com.techelevator;

public class Car extends Vehicle implements Toll {

	public Car() {
		super("Car");
	}

	public double calculatedToll(double tollRate) {

		tollRate = distance * 0.020;

		return tollRate;
	}

}
