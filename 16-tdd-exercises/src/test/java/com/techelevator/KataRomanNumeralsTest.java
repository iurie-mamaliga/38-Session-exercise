package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	
	@Test
	public void test_invalid_input_lower_bound() {
		for(int i = Integer.MIN_VALUE; i <= 0; i++)  {
			Assert.assertNull(KataRomanNumerals.romify(i));
		}
	}
	
	@Test
	public void test_invalid_input_upper_bound() {
		for(int i = 4000; i >= Integer.MAX_VALUE; i++)  {
			Assert.assertNull(KataRomanNumerals.romify(i));
		}
	}
	
	@Test
	public void imput_of_1_returns_I() {
		
		int input = 1;
		
		String result = KataRomanNumerals.romify(input);
		Assert.assertEquals("I",  result);;
	}
	
	@Test
	public void imput_of_5_returns_V() {
		
		int input = 5;
		
		String result = KataRomanNumerals.romify(input);
		Assert.assertEquals("V",  result);;
	}

	
	@Test
	public void imput_of_10_returns_X() {
		
		int input = 10;
		
		String result = KataRomanNumerals.romify(input);
		Assert.assertEquals("X",  result);;
	}
	
	@Test
	public void imput_of_10_returns_XIV() {
		
		int input = 14;
		
		String result = KataRomanNumerals.romify(input);
		Assert.assertEquals("XIV",  result);
	}
	
	@Test
	public void imput_of_147_returns_CXLVII() {
		
		int input = 147;
		
		String result = KataRomanNumerals.romify(input);
		Assert.assertEquals("CXLVII",  result);;
	}
	
	@Test
	public void imput_of_2018_returns_MMXVIII() {
		
		int input = 2018;
		
		String result = KataRomanNumerals.romify(input);
		Assert.assertEquals("MMXVIII",  result);;
	}


}
