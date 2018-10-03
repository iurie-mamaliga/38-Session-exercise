package com.techelevator;

import java.util.Scanner;

public class DeliveryHub {
	
	
	public static void main(String[] args) {
		
				
		Scanner newWeight = new Scanner(System.in);
		
		System.out.print("Please enter the weight of the package:   ");
		
		int weight = Integer.parseInt(newWeight.nextLine());
		
		Scanner unit = new Scanner(System.in);
		
		System.out.print("(P)ounds or (O)unces?     ");
		String choice = unit.nextLine();
		if (choice.equals("P")) {
			weight = weight * 16;
		}
		
		Scanner distances = new Scanner(System.in);
		
		System.out.print("What distance will it be travelling to?      ");;
		int distance = Integer.parseInt(distances.nextLine());
		System.out.println();
		
		PostalFirstClass postalFirst = new PostalFirstClass(distance, weight);
		PostalSecondClass postalSecond = new PostalSecondClass(distance, weight);
		PostalService postalThird = new PostalService(distance, weight);
		Fedex fedex = new Fedex(distance, weight);
		Spu spuGround = new Spu(distance, weight);
		SpuBiz spuBusiness = new SpuBiz(distance, weight);
		SpuNextDay spuNextDay = new SpuNextDay(distance, weight);
		
		DeliveryDriver[] deliveryQuotes = new DeliveryDriver[] {postalFirst, postalSecond, postalThird, fedex, spuGround, spuBusiness, spuNextDay};
		
		
		System.out.println("Delivery Method           $ Cost");;
		System.out.println("___________________________________");;
		
		
		
		for(DeliveryDriver   : deliveryQuotes) {
			System.out.println(name + "                $" + calculateRate());
			System.out.println();
		}
		
	}

	

}
