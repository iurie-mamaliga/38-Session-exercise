package com.techelevator;

public class Postal {
	protected int distance;
	protected int weight;
	protected double rate;
	protected String service;
	protected String name;
	
	public Postal(int distance, int weight) {
		this.distance = distance;
		this.weight = weight;;
	}
	
	
	public double calculateRate() {
		return rate;
		
	}
	
	public String getName(String name) {
		return name;
	}
	
	public int getDistance() {
		return distance;
	}

	public int getWeight() {
		return weight;
	}

	public double getRate() {
		return rate;
	}
	
	

}
