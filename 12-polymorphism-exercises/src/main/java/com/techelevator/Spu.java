package com.techelevator;


public class Spu extends Postal implements DeliveryDriver {
	
	
	public Spu(int distance, int weight) {
		super(distance, weight);
	}
	public double calculateRate(int distance, int weight) {
		rate = (weight * 0.0050) * distance;
		return rate;
		
	}
	
	public String getName() {
		return "SPU (4-day Ground)";
	}
	

}

