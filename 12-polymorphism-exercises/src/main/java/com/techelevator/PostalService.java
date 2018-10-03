package com.techelevator;

public class PostalService  extends Postal implements DeliveryDriver {
	
	
	public PostalService(int distance, int weight) {
		super(distance, weight);
	}
	
	public double calculateRate(int distance, int weight) {
		if(weight <= 2) {
			rate = 0.0020 * distance;
		} else if (weight >= 3 && weight <= 8) {
			rate = 0.0022 * distance;
		}else if(weight >= 9 && weight <= 15) {
			rate = 0.0024 * distance;
		}else if (weight >= 16 && weight <= 48) {
			rate = 0.0150 * distance;
		}else if(weight >= 64 && weight <= 128) {
			rate = 0.0160 *distance;
		} else {
			rate = 0.0170 * distance;
		}
		return rate;
	}
	
	public String getName() {
		return "PostalService (3rd Class)";
	}
	

}
