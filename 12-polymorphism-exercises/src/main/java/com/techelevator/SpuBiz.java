package com.techelevator;

public class SpuBiz extends Postal implements DeliveryDriver {

	public SpuBiz(int distance, int weight) {
		super(distance, weight);
	}

	@Override
	public double calculateRate() {
		return rate = (weight * 0.050) / 16 * distance;

	}

	public String getName() {
		return "SPU (2-day Business)      ";
	}
}
