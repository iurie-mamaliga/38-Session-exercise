package com.techelevator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class TestStringBits {

	private StringBits testStringBits;

	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {

	}

	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {

	}

	@Before
	public void setup() {
		testStringBits = new StringBits();
	}

	@After
	public void teardown() {

	}

	@Test
	public void pick_every_other_char() {

		Assert.assertEquals("Hlo", testStringBits.getBits("Hello"));
		Assert.assertEquals("Tceeao", testStringBits.getBits("Techelevator"));
		Assert.assertEquals("Hello", testStringBits.getBits("Heeololeo"));
		Assert.assertEquals("h", testStringBits.getBits("hi"));
		Assert.assertEquals("H", testStringBits.getBits("H"));
		Assert.assertEquals("", testStringBits.getBits(""));

	}

}
