package com.techelevator;

public class Spu {
	
	protected int distance;
	protected int weight;
	protected double spu4DayRate;
	protected double spuBizRate;
	protected double spuNextDayRate;

	public Spu(int distance, int weight) {
		this.distance = distance;
		this.weight = weight;
		
	}


	public double getSpu4DayRate(int distance, int wieght) {
		spu4DayRate = (weight * 0.0050) / 16 * distance;
		return spu4DayRate;

	}
	
	public double getSpuBizRate(int distance, int wieght) {
		spuBizRate = (weight * 0.050) / 16 * distance;
		return spuBizRate;

	}
	
	public double getSpuNextDayRate(int distance, int wieght) {
		spuNextDayRate = (weight * 0.075) / 16 * distance;
		return spuNextDayRate;

	}

	public String getName() {
		return "SPU (4-day Ground)       ";
	}
	
	public int getDistance() {
		return distance;
	}

	public int getWeight() {
		return this.weight;
	}


}
