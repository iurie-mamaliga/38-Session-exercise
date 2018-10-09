package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	@Test
	public void lower_bound_invalid_test() {
		for(int i = -1000000; i <= 0; i++) {
			String result = KataFizzBuzz.fizzyBuzzy(i);
			Assert.assertEquals("", result);
		}
		
	}
	
	@Test
	public void upper_bound_invalid_test() {
		for(int i = 101; i >= 1000000; i++) {
			String result = KataFizzBuzz.fizzyBuzzy(i);
			Assert.assertEquals("", result);
		}
		
	}

	@Test
	public void number_is_multiple_of_3_and_5_returns_FizzBuzz() {

		int number = 45;

		String result = KataFizzBuzz.fizzyBuzzy(number);
		Assert.assertEquals("FizzBuzz", result);
	}

	@Test
	public void number_contains_3_and_5_returns_FizzBuzz() {

		int number = 53;

		String result = KataFizzBuzz.fizzyBuzzy(number);
		Assert.assertEquals("FizzBuzz", result);
	}

	@Test
	public void number_contains_3_returns_Fizz() {

		int number = 38;

		String result = KataFizzBuzz.fizzyBuzzy(number);
		Assert.assertEquals("Fizz", result);
		;
	}

	@Test
	public void number_is_multiple_of_3_returns_Fizz() {

		int number = 6;

		String result = KataFizzBuzz.fizzyBuzzy(number);
		Assert.assertEquals("Fizz", result);
		;
	}

	@Test
	public void number_is_multiple_of_5_returns_Bizz() {

		int input = 25;

		String result = KataFizzBuzz.fizzyBuzzy(input);
		Assert.assertEquals("Buzz", result);
	}

	@Test
	public void number_contains_5_returns_Bizz() {

		int input = 52;

		String result = KataFizzBuzz.fizzyBuzzy(input);
		Assert.assertEquals("Buzz", result);
	}

	@Test
	public void number_is_1_returns_1() {

		int number = 1;

		String result = KataFizzBuzz.fizzyBuzzy(number);
		Assert.assertEquals("1", result);
	}

	@Test
	public void number_is_8_returns_8() {

		int number = 8;

		String result = KataFizzBuzz.fizzyBuzzy(number);
		Assert.assertEquals("8", result);
	}

}
