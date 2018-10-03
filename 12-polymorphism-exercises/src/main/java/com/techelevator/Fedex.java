package com.techelevator;

public class Fedex extends Postal implements DeliveryDriver{
	
	
	
	public Fedex(int distance, int weight) {
		super(distance, weight);
	}
	
	
	
	public double calculateRate(int distance, int weight) {
		if(distance < 500 && weight < 48) {
			rate = 20.0;
		}else if(distance < 500 && weight > 48) {
			rate = 20.0 + 3.0;
		}else if(distance > 500 && weight < 48) {
			rate = 20.0 + 5.0;
		}else {
			rate = 20.0 + 5.0 + 3.0;
		}
		return rate;
	}
	
	public String getName() {
		return "Fedex";
	}

	
}



