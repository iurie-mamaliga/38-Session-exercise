package com.techelevator;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (seperated by spaces):   ");
		String userInput = input.nextLine();

		String[] yourNumbers = userInput.split(" ");
		for (int i = 0; i < yourNumbers.length; i++) {

			int number = Integer.parseInt(yourNumbers[i]);

			int consoleLength = 1; // Assigns the length of console to minimum 1 digit and it increases according
									// to the
									// input value because of "for loop".

			while (consoleLength <= number / 2) {
				consoleLength = consoleLength * 2; // These two statements are the main converter.
			}

			while (consoleLength > 0) {

				// To get 0 value of binary number

				if (number < consoleLength) {

					System.out.print(0);
				}

				// To get 1 value of binary number

				else {
					System.out.print(1);
					number = number - consoleLength;
				}

				consoleLength = consoleLength / 2; // Determines the length of console.
			}

			System.out.println(); // Prints the result of different numbers in separate lines.
		}

	}

}
