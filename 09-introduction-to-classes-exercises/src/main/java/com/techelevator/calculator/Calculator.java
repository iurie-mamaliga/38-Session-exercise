package com.techelevator.calculator;

public class Calculator {

	private int currentValue;
	
	public int add(int addend) {
		return (this.currentValue += addend);
	}
	public int multiply(int multiplier) {
		return (this.currentValue *= multiplier);		
	}
	public int subtract(int subtractend) {
		return(this.currentValue -= subtractend);
	}
	public int power( int exponent) { 
		return ((int)Math.pow(this.currentValue, exponent));
	
	}
	
	public void reset() {
		this.currentValue = 0;
	}
	
	
	public int getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	
}
