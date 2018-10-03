package com.techelevator;

public class CarTrailer extends Vehicle implements Toll{
	
		public CarTrailer( ) {
			super("Car wtih trailer");
		}
		
		public double calculatedToll(double tollRate) {
				
				tollRate = distance * 0.020 + 1.0;
			return tollRate;
		}
		
	}



