package com.techelevator;

public class Fedex implements DeliveryDriver {

	private int distance;
	private int weight;
	private double rate = 20.00;

	public Fedex(int distance, int weight) {
		this.distance = distance;
		this.weight = weight;
		;
	}

	public double calculateRate(int distance, int weight) {
		if (distance > 500 && weight > 48) {
			rate += 8.000;
		} else if (distance > 500) {
			rate += 5.0;
		} else if (weight > 48) {
			rate += 3.0;
		} else {
			return rate;
		}
		return rate;
	}

	public String getName() {
		return "Fexed                     ";
	}

	public int getDistance() {
		return distance;
	}

	public int getWeight() {
		return this.weight;
	}

}
