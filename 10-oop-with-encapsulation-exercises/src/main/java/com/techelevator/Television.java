package com.techelevator;

public class Television {

	// Attributes, Initially the TV is set to off.

	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;

	// Constructor;

	public Television() {

	}

	// Methods;

	public void turnOn() {
		this.isOn = true;

	}

	public void turnOff() {
		this.isOn = false;
	}

	public void changeChannel(int newChannel) {
		if (this.isOn == true && newChannel >= 3 && newChannel <= 18) {
			this.currentChannel = newChannel;
		}
	}

	public void channelUp() {
		if (this.isOn == true) {
			if (this.currentChannel == 18) {
				this.currentChannel = 3;
			} else {
				this.currentChannel++;
			}
		}
	}

	public void channelDown() {
		if (this.isOn == true) {
			if (this.currentChannel == 3) {
				this.currentChannel = 18;
			} else {
				this.currentChannel--;
			}
		}
	}

	public void raiseVolume() {
		if (this.isOn == true) {
			if (this.currentVolume < 10) {
				this.currentVolume++;
			}
		}
	}

	public void lowerVolume() {
		if (this.isOn == true) {
			if (this.currentVolume > 0) {
				this.currentVolume--;
			}
		}
	}

	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}
}
