package com.techelevator;

public class PostalFirstClass extends Postal implements DeliveryDriver {
	
	
	
	public PostalFirstClass(int distance, int weight) {
		super(weight, distance);
	}
	
	
	
	@Override
	
	public double calculateRate(int distance, int weight) {
		if(weight <= 2.0) {
			rate = 0.035 * distance;
		} else if (weight >= 3.0 && weight <= 8.0) {
			rate = 0.040 * distance;
		}else if(weight >= 9.0 && weight <= 15.0) {
			rate = 0.047 * distance;
		}else if (weight >= 16.0 && weight <= 48.0) {
			rate = 0.195 * distance;
		}else if(weight >= 64.0 && weight <= 128.0) {
			rate = 0.450 *distance;
		} else {
			rate = 0.500 * distance;
		}
		return rate;
	}
	public String getName() {
		return "Postal Service (1st Class)";
	}

}
