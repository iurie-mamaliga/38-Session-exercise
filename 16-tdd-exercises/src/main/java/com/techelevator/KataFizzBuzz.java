package com.techelevator;

public class KataFizzBuzz {

	public static String fizzyBuzzy(int number) {
	
		Integer intInstance = new Integer(number);      
		String value = intInstance.toString();
		
		if(number <= 0 || number >= 101) {
			  return "";
		  } else if((number % 3 == 0 && number % 5 == 0) || (value.contains("3") && value.contains("5"))) {
			  return "FizzBuzz";
		  } else if( number % 5 == 0 || value.contains("5")) {
			  return "Buzz";
		  } else if (number % 3 == 0 || value.contains("3")) {
			  return"Fizz";
		  }
		
		
		  
		  return value;
	}

}
