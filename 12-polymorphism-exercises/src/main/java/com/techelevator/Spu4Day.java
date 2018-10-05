package com.techelevator;

public class Spu4Day extends Spu implements DeliveryDriver {
	
	private double rate;
	
	public Spu4Day(int distance, int weight) {
		super(distance, weight);
	}

	
	public double calculateRate(int distance, int wieght) {
		rate = super.getSpu4DayRate(distance, weight);
		return rate;

	}

	public String getName() {
		return "SPU (4-day Ground)        ";
	}

}
