package com.techelevator;

public class Spu extends Postal implements DeliveryDriver {

	public Spu(int distance, int weight) {
		super(distance, weight);
	}

	@Override
	public double calculateRate() {
		rate = (weight * 0.0050) / 16 * distance;
		return rate;

	}

	public String getName() {
		return "SPU (4-day Ground)       ";
	}

}
