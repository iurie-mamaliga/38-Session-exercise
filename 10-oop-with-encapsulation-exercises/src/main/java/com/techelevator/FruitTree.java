package com.techelevator;

public class FruitTree {
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	private int startingPiecesOfFruit;
	
	//Constructor
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.startingPiecesOfFruit = startingPiecesOfFruit;
		this.piecesOfFruitLeft = this.startingPiecesOfFruit;
		
	}
	
	// Method
	
	  public boolean pickFruit(int numberOfPiecesToRemove) {
		  
		if(this.piecesOfFruitLeft > 0) {
			this.piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		} else {
			return false;
		}
		  
	  }

	public String getTypeOfFruit() {
		return typeOfFruit;
	}


	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}


	public int getStartingPiecesOfFruit() {
		return startingPiecesOfFruit;
	}

	public void setStartingPiecesOfFruit(int startingPiecesOfFruit) {
		this.startingPiecesOfFruit = startingPiecesOfFruit;
	}

	
}
