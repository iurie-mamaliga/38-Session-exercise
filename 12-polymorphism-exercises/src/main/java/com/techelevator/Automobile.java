package com.techelevator;

public class Automobile {

	protected String name;
	protected double distance;
	protected double rate;
	
	//  Constructor
	
	public Automobile(String name, double distance) {
		this.name = name;
		this.distance = distance;
		
	}
	
	public double calculateToll() {
		return rate;
	}

	public String getName() {
		return name;
	}
	
	public double getCalculateToll() {
		return rate;
	}

	public double getDistance() {
		return distance;
	}

	public double getRate() {
		return rate;
	}
	
	

}
