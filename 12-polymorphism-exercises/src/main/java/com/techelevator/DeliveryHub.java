package com.techelevator;

import java.util.Scanner;

public class DeliveryHub {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the weight of the package:   ");

		int myWeight = Integer.parseInt(input.nextLine());

		System.out.print("(P)ounds or (O)unces?     ");
		String choice = input.nextLine();
		if (choice.equalsIgnoreCase("p")) {
			myWeight = myWeight * 16;
		} else {
			myWeight = myWeight;
		}

		System.out.print("What distance will it be travelling to?      ");
		;
		int distance = Integer.parseInt(input.nextLine());
		System.out.println();

		PostalFirstClass postalFirst = new PostalFirstClass(distance, myWeight);
		PostalSecondClass postalSecond = new PostalSecondClass(distance, myWeight);
		PostalService postalThird = new PostalService(distance, myWeight);
		Fedex fedex = new Fedex(distance, myWeight);
		Spu spuGround = new Spu(distance, myWeight);
		SpuBiz spuBusiness = new SpuBiz(distance, myWeight);
		SpuNextDay spuNextDay = new SpuNextDay(distance, myWeight);

		DeliveryDriver[] deliveryQuotes = new DeliveryDriver[] { postalFirst, postalSecond, postalThird, fedex,
				spuGround, spuBusiness, spuNextDay };

		System.out.println("Delivery Method                       $ Cost");
		;
		System.out.println("___________________________________");
		;

		for (DeliveryDriver currentRate : deliveryQuotes) {
			String name = currentRate.getName();
			Double rate = currentRate.calculateRate();

			System.out.println(name + "                            $" + rate);
			System.out.println();
		}

	}

}
