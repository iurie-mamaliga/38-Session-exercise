package com.techelevator;

public class Truck implements Vehicle {
		
		private int distance;
		private double rate;
		private int axle;

		
		public Truck(int axle) {
			this.axle = axle;
		}
			
		
		@Override
		public double calculateToll(int distance) {
			if(axle <= 4) {
				rate = distance * 0.040;
			} else if(axle > 4 && axle <= 6) {
				rate = distance * 0.45;
			} else {
				rate = distance * 0.48;
			}
			
			return rate;
		}
		public String getName() {
			return "Truck          ";
		}

	}



