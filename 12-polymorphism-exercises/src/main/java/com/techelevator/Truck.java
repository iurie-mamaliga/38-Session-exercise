package com.techelevator;

public class Truck extends Automobile implements Vehicle{
	private int axle;
	
	public Truck(String name, double distance ) {
		super("Truck", distance);
	}
	
	public double calculateToll(int axle) {
			if(axle <= 4) {
				rate = distance * 0.040;
			} else if( axle >=5 && axle <= 6) {
				rate = distance * 0.045;
			} else {
				rate = distance * 0.048;
			}
			return rate;
	}
	public int getAxle() {
		return axle;
	}

}
