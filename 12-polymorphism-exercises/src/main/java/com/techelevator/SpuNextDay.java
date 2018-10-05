package com.techelevator;

public class SpuNextDay extends Spu implements DeliveryDriver {
	
	private double rate;

	public SpuNextDay(int distance, int weight) {
		super(distance, weight);
	}

	public double calculateRate(int distance, int weight) {
		rate = super.getSpuNextDayRate(distance, weight);
		return rate;

	}

	public String getName() {
		return "SPU (Next-Day)            ";
	}
}
