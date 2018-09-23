package com.techelevator;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String length;
		char unit;

		System.out.print("Please enter the unit to be converted : ");

		length = input.nextLine();
		double userInput = Double.parseDouble(length);

		System.out.print("Is the length in (M)eter or (F)oot? Please type lowercase'm' or 'f' : ");

		unit = input.next().charAt(0);

		double meter = userInput * 0.3048;
		double feet = (userInput * 3.2808399);
		if (unit == 'f') {
			System.out.println(userInput + " " + "F" + " " + "is equal to" + " " + meter + " " + "M");
		} else if (unit == 'm') {
			System.out.println(userInput + " " + "M" + " " + "is equal to" + " " + feet + " " + "F");
		} else {
			System.out.print(
					"Please enter valid unit. THANK YOU!");
		}
	}
}
