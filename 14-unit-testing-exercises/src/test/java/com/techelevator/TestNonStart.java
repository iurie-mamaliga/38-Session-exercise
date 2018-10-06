package com.techelevator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class TestNonStart {

	private NonStart testNonStart;

	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {

	}

	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {

	}

	@Before
	public void setup() {
		testNonStart = new NonStart();
	}

	@After
	public void teardown() {

	}

	@Test
	public void remove_first_char() {

		Assert.assertEquals("ellohere", testNonStart.getPartialString("Hello", "There"));
		Assert.assertEquals("avaode", testNonStart.getPartialString("Java", "Code"));
		Assert.assertEquals("eyan", testNonStart.getPartialString("hey", "fan"));
		Assert.assertEquals("me", testNonStart.getPartialString("am", "he"));
		Assert.assertEquals("t", testNonStart.getPartialString("at", "I"));
		Assert.assertEquals("m", testNonStart.getPartialString("I", "am"));
		Assert.assertEquals("", testNonStart.getPartialString("x", "y"));

	}

}
