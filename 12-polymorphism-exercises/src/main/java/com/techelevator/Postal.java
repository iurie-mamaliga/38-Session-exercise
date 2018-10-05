package com.techelevator;

public class Postal {
	protected int distance;
	protected int weight;
	protected double firstClassRate;
	protected double secondClassRate;
	protected double thirdClassRate;;

	public Postal(int distance, int weight) {
		this.distance = distance;
		this.weight = weight;
	}
	
	public double getFirstClassRate(int distance, int weight) {
		if (weight <= 2.0) {
			firstClassRate  = 0.035 * distance;
		} else if (weight >= 3.0 && weight < 9) {
			firstClassRate  = 0.040 * distance;
		} else if (weight >= 9.0 && weight < 16) {
			firstClassRate  = 0.047 * distance;
		} else if (weight >= 16.0 && weight < 64) {
			firstClassRate  = 0.195 * distance;
		} else if (weight >= 64.0 && weight < 144) {
			firstClassRate  = 0.450 * distance;
		} else {
			firstClassRate  = 0.500 * distance;
		}
		return firstClassRate ;
	}
	
	public double getSecondClassRate(int distance, int weight) {
		if (weight <= 2) {
			secondClassRate = 0.0035 * distance;
		} else if (weight >= 3 && weight < 9) {
			secondClassRate = 0.0040 * distance;
		} else if (weight >= 9 && weight < 16) {
			secondClassRate = 0.0047 * distance;
		} else if (weight >= 16 && weight < 64) {
			secondClassRate = 0.0195 * distance;
		} else if (weight >= 64 && weight < 144) {
			secondClassRate= 0.0450 * distance;
		} else {
			secondClassRate= 0.0500 * distance;
		}
		return secondClassRate;
	}
	
	public double getThirdClassRate(int distance, int weight) {
		if (weight <= 2) {
			thirdClassRate = 0.0020 * distance;
		} else if (weight >= 3 && weight < 9) {
			thirdClassRate = 0.0022 * distance;
		} else if (weight >= 9 && weight < 16) {
			thirdClassRate = 0.0024 * distance;
		} else if (weight >= 16 && weight < 64) {
			thirdClassRate = 0.0150 * distance;
		} else if (weight >= 64 && weight < 144) {
			thirdClassRate = 0.0160 * distance;
		} else {
			thirdClassRate = 0.0170 * distance;
		}
		return thirdClassRate;
	}

	

	public String getName(String name) {
		return name;
	}

	public int getDistance() {
		return distance;
	}

	public int getWeight() {
		return this.weight;
	}

	

}
