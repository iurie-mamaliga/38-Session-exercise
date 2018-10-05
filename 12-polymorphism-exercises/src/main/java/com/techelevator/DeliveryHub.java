package com.techelevator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DeliveryHub {

	private static DecimalFormat df2 = new DecimalFormat("0.00");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int newWeight;

		System.out.print("Please enter the weight of the package:   ");

		int userWeight = Integer.parseInt(input.nextLine());

		System.out.print("(P)ounds or (O)unces?     ");
		String choice = input.nextLine();
		if (choice.equalsIgnoreCase("p")) {
			newWeight = userWeight * 16;
		} else {
			newWeight = userWeight;
		}

		System.out.print("What distance will it be travelling to?      ");

		int userDistance = Integer.parseInt(input.nextLine());
		System.out.println();

		PostalFirstClass postalFirst = new PostalFirstClass(userDistance, newWeight);
		PostalSecondClass postalSecond = new PostalSecondClass(userDistance, newWeight);
		PostalThirdClass postalThird = new PostalThirdClass(userDistance, newWeight);
		Fedex fedex = new Fedex(userDistance, newWeight);
		Spu4Day spuGround = new Spu4Day(userDistance, newWeight);
		SpuBiz spuBusiness = new SpuBiz(userDistance, newWeight);
		SpuNextDay spuNextDay = new SpuNextDay(userDistance, newWeight);

		DeliveryDriver[] deliveryQuotes = new DeliveryDriver[] { postalFirst, postalSecond, postalThird, fedex,
				spuGround, spuBusiness, spuNextDay };

		System.out.println("Delivery Method                            $ Cost");
		
		System.out.println("____________________________________________________");

		for (DeliveryDriver currentRate : deliveryQuotes) {
			String name = currentRate.getName();
			Double rate = currentRate.calculateRate(userDistance, newWeight);

			System.out.format(name + "                 $" + rate);
			System.out.println();
		}

	}

}
