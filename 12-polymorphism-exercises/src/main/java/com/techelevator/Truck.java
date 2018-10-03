package com.techelevator;

public class Truck extends Vehicle implements Toll{
	private int axel;
	
	public Truck( ) {
		super("Truck");
	}
	
	public double calculatedToll(double tollRate) {
			if(axel <= 4) {
				tollRate = distance * 0.040;
			} else if( axel >=5 && axel <= 6) {
				tollRate = distance * 0.045;
			} else {
				tollRate = distance * 0.048;
			}
			return tollRate;
	}

}
