package com.techelevator;

public class PostalThirdClass extends Postal implements DeliveryDriver {
	
	public double rate;


	public PostalThirdClass(int distance, int weight) {
		super(distance, weight);
	}

	

	public double calculateRate(int distance, int weight) {
		rate = super.getThirdClassRate(distance, weight);
		return rate;
	}
		
	public String getName() {
		return "Postal Service (3rd Class)";
	}

}
