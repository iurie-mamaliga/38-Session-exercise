package com.techelevator;

import java.util.Scanner;

public class VehicleProgram {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the distance travelled:   :   ");

		int distance = Integer.parseInt(input.nextLine());
		
		
		Car car1 = new Car("Car1", distance);
		CarTrailer car2 = new CarTrailer("Car2", distance);
		Truck truck = new Truck("Truck", distance);
		Tank tank = new Tank("Tank", distance);
		
		Vehicle[] tollCalculator = new Vehicle[] { car1, car2, truck, tank};
		
		
		System.out.println("Please enter the type of Vehicle: Car = 1, Car Wtih Trailer = 2, Truck = 3, Tank = 4");
		String choice = input.nextLine();
		Automobile vehicle;
		
		if(choice.equals("1")) {
			vehicle = car1;
		} else if (choice.equals(2)) {
			vehicle = car2;
		} else if (choice.equals(3)) {
			vehicle = truck;
		
		} else if(choice.equals("4")) {
			vehicle =  tank;
		}
		
		// System.out.println("Please enter the number of axles:");
		// String axel = input.nextLine();
		
		System.out.println("Vehicle    Distance Travelled          Toll $");
		;
		System.out.println("_____________________________________________________________________");
		;

		for (Vehicle tollRate : tollCalculator) {
			String Vehicle = tollRate.getName();
			Double rate = tollRate.calculateToll();

			System.out.println(Vehicle + "             " + distance + "                   $" + rate);
			System.out.println();
		
		
		
		
	}
	}
}


