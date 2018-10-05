package com.techelevator;

public class Car implements Vehicle {
	private int distance;
	private double rate;
	private boolean pullingTrailer;

	public Car(boolean pullingTrailer) {
		this.pullingTrailer = pullingTrailer;
	
	}

	public double calculateToll(int distance) {
		if(pullingTrailer == false) {
			rate = distance * 0.020;
		}else {
			rate += 1;
		}

		return rate;
	}
	public String getName() {
		return "Car            ";
	}

}
