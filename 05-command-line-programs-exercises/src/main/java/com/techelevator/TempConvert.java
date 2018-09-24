package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the temperature to be converted : ");

		 double userInput= input.nextDouble();
	
		System.out.print("Is the temperature in (C)elcius or (F)arenheit? Please type lowercase'c' or 'f' : ");

		char unit = input.next().charAt(0);
		/*
		 * As the calculation follows PEMDAS rule 32 must be subtracted from farenheit value
		 * before dividing by 1.8.
		 */

		double farenheit = userInput * 1.8 + 32;
		double celcius = (userInput - 32) / 1.8;

		if (unit == 'c') {
			
			farenheit  *= 100;
			int say = (int) farenheit;
			farenheit = say/100.0;
			
			System.out.println(userInput + " " + "C" + " " + "is equal to" + " " + farenheit + " " + "F");

		} else if (unit == 'f') {
			
			celcius *= 100;
			int let = (int) celcius;
			celcius = let/100.0;
			
			System.out.println(userInput + " " + "F" + " " + "is equal to" + " " + celcius + " " + "C");

		} else {
			System.out.println("Please enter a valid unit. THANK YOU!");
		}
	}
}
