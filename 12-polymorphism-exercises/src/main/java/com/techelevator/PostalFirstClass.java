package com.techelevator;

public class PostalFirstClass extends Postal implements DeliveryDriver {
	
	private double rate;

	public PostalFirstClass(int distance, int weight) {
		super(weight, distance);
	}

	

	public double calculateRate(int distance, int weight) {
		rate = super.getFirstClassRate(distance, weight);
		return rate;
	}
	
	
	@ Override
	public String getName() {
		return "Postal Service (1st Class)";
	}

}
