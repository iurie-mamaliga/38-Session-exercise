package com.techelevator.dog;

public class Dog {

	private boolean sleeping;
	
	//Method
	
	public String makeSound() {
		String dogSound = sleeping ?  "Zzzzz..."  : "Woof!";
		return dogSound;
	}
	public void sleep() {
			sleeping = true;
			}
	public void wakeUp() {
	sleeping = false;
	}
	public Dog() {
	}
	public boolean isSleeping() {
		return sleeping;
	}
	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}
	
	
}
