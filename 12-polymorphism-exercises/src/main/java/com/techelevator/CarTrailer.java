package com.techelevator;

public class CarTrailer extends Automobile implements Vehicle {
	
		public CarTrailer( String name, double distance) {
			super("Car2", distance);
		}
		
		public double calculateToll(double tollRate) {
				
				rate = distance * 0.020 + 1.0;
			return rate;
		}
		
	}



