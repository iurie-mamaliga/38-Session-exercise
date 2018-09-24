package com.techelevator;

/*
 The Fibonacci numbers are the integers in the following sequence:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number here --> ");
		int userInput = input.nextInt();

		int num0=0, num1=1, num2;

		/*
		 * Since the first two indices are constants(0 & 1), making the reference to those two
		 * values would fail to create a for loop that falls within the range of the
		 * input value, so a third value is necessary to satisfy the condition.
		 */

		for (num0 = 0, num1 = 1, num2 = 0; num2 <= userInput; num2 = num0 + num1) {

			num0 = num1;
			num1 = num2;

			System.out.print(num2 + " ");

		}

	}
}
