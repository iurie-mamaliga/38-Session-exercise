package com.techelevator;

public class PostalSecondClass extends Postal implements DeliveryDriver {

	public PostalSecondClass(int distance, int weight) {
		super(distance, weight);
	}

	@Override

	public double calculateRate() {
		if (weight <= 2) {
			rate = 0.0035 * distance;
		} else if (weight >= 3 && weight <= 8) {
			rate = 0.0040 * distance;
		} else if (weight >= 9 && weight <= 15) {
			rate = 0.0047 * distance;
		} else if (weight >= 16 && weight <= 48) {
			rate = 0.0195 * distance;
		} else if (weight >= 64 && weight <= 128) {
			rate = 0.0450 * distance;
		} else {
			rate = 0.0500 * distance;
		}
		return rate;
	}

	public String getName() {
		return "Postal Service (2nd Class)";
	}

}
