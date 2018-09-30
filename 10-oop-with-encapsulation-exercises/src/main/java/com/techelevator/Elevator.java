package com.techelevator;

public class Elevator {
//Propertice
	
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;


// Cunstructor

	public Elevator(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
		
	}
	//Getters And Setters

		public int getCurrentFloor() {
			return currentFloor;
		}

		public int getNumberOfFloors() {
			return numberOfFloors;
		}

		public boolean isDoorOpen() {
			return doorOpen;
		}
//Methods
	
	public void openDoor() {
		this.doorOpen = true;
	}
	
	public void closeDoor() {
		this.doorOpen = false;
	}
	
	public void goUp(int desiredFloor) {
	    if(this.doorOpen == false && desiredFloor > this.currentFloor && desiredFloor <= this.numberOfFloors) {
	        this.currentFloor = desiredFloor;
	    }
	}
	public void goDown(int desiredFloor) {
		if(this.doorOpen == false && desiredFloor < this.currentFloor && desiredFloor >= 1) {
			this.currentFloor = desiredFloor;
		}
	}
	
	
	

}