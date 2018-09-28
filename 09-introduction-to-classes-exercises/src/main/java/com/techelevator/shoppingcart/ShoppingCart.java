package com.techelevator.shoppingcart;

public class ShoppingCart {

	int totalNumberOfItems;
	double totalAmountOwed;
	
	 public double getAveragePricePerItem() {
		 if(this.totalAmountOwed == 0 && this.totalNumberOfItems == 0) {
			 return 0;
		 }else {
		 return (this.totalAmountOwed / this.totalNumberOfItems);
		 }
	 }
	 public void addItems(int numberOfItems, double pricePerItem) {
		 this.totalNumberOfItems += numberOfItems;
		 this.totalAmountOwed += pricePerItem * numberOfItems;
		 
	 }
	 public void empty() {
		 totalNumberOfItems = 0;
		 totalAmountOwed = 0.0;
	 }
	 public ShoppingCart() {
		 
	 }
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	 
}
