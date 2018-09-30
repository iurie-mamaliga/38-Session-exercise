package com.techelevator;

public class Airplane {
	// Attributes

	private String planeNumber;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	private int totalCoachSeats;

	// Constructor

	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}

	// Method

	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {

		if (forFirstClass == true && totalNumberOfSeats <= getAvailableFirstClassSeats()) {
			this.bookedFirstClassSeats += totalNumberOfSeats;
			return true;
		} else if (forFirstClass == false && totalNumberOfSeats <= getAvailableCoachSeats()) {
			this.bookedCoachSeats += totalNumberOfSeats;
			return true;
		} else {
			return false;

		}

	}
	public int getAvailableFirstClassSeats() {
		availableFirstClassSeats =  this.totalFirstClassSeats - this.bookedFirstClassSeats;
		return availableFirstClassSeats;
	}
	public int getAvailableCoachSeats() {
		availableCoachSeats = this.totalCoachSeats - this.bookedCoachSeats;
		return this.availableCoachSeats;
	}

	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}

}
