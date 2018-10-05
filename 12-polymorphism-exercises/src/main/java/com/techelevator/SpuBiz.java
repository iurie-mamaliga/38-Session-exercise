package com.techelevator;

public class SpuBiz extends Spu implements DeliveryDriver {
	
	private double rate;

	public SpuBiz(int distance, int weight) {
		super(distance, weight);
	}

	public double calculateRate(int distance, int weight) {
		rate = super.getSpuBizRate(distance, weight);
		return rate;

	}

	public String getName() {
		return "SPU (2-day Business)      ";
	}
}
