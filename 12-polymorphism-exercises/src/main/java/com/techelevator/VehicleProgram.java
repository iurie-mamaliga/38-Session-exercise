package com.techelevator;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class VehicleProgram {

	private static DecimalFormat df2 = new DecimalFormat("0.00");

	public static void main(String[] args) {
	    String userInput;
	    boolean loopBreak = true;
	    Scanner input = new Scanner(System.in);
	    NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
	    List<Vehicle> vehicles = new ArrayList<Vehicle>();
	    int totalDistance = 0;
	    double totalCost = 0.0;

	    while (loopBreak == true) {
	        System.out.print("\nPlease enter next vehicle type: (Car) (Truck) (Tank) (Done) :  ");
	        String payType = input.nextLine();

	        if (payType.toUpperCase().equals("CAR")) {

	            boolean loopBreak2 = true;

	            while (loopBreak2) {
	                System.out.print("\nIs the car pulling a trailer: (Y)es or (N)o ==>");
	                userInput = input.nextLine();
	                String trailerStatus = userInput;

	                if (trailerStatus.toUpperCase().equals("Y")) {
	                    vehicles.add(new Car(true));
	                    loopBreak2 = false;
	                } else if (trailerStatus.toUpperCase().equals("N")) {
	                    vehicles.add(new Car(false));
	                    loopBreak2 = false;
	                } else {
	                    System.out.print("\nInvalidResponse\n");
	                }
	            }

	        } else if (payType.toUpperCase().equals("TRUCK")) {
	            System.out.print("\nHow many axles does the truck have? (4) (6) (8) ... etc. ==> ");
	            userInput = input.nextLine();
	            int numberOfAxles = Integer.parseInt(userInput);
	            vehicles.add(new Truck(numberOfAxles));

	        } else if (payType.toUpperCase().equals("TANK")) {
	            vehicles.add(new Tank());

	        } else if (payType.toUpperCase().equals("DONE")) {
	            loopBreak = false;
	        } else {
	            System.out.print("\nInvalid Response!");
	        }
	    }

	    System.out.println("\n\nVehicle\t\t\tDistance Traveled\t\tToll $");
	    for (Vehicle vehicle : vehicles) {
	        int distRand = new Random().nextInt(230) + 10;
	        totalCost += vehicle.calculateToll(distRand);
	        totalDistance += distRand;
	        System.out.println(vehicle.getName() + "\t\t\t" + distRand + "\t\t\t\t"
	                + defaultFormat.format(vehicle.calculateToll(distRand)));
	    }
	    System.out.println("\n\nTotal Distance: " + totalDistance);
	    System.out.println("Total Toll Cost: " + defaultFormat.format(totalCost));

	}

	private static int getRandomNumberInRange(int min, int max) {

	    if (min >= max) {
	        throw new IllegalArgumentException("max must be greater than min");
	    }

	    Random r = new Random();
	    return r.nextInt((max - min) + 1) + min;
	}
	}

