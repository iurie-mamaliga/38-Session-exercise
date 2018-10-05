package com.techelevator;

public class PostalSecondClass extends Postal implements DeliveryDriver {
	
	public double rate;


	public PostalSecondClass(int distance, int weight) {
		super(distance, weight);
	}

	

	public double calculateRate(int distance, int weight) {
		rate = super.getSecondClassRate(distance, weight);
		return rate;
	}
		
	public String getName() {
		return "Postal Service (2nd Class)";
	}

}
