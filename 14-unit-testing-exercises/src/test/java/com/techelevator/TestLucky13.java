package com.techelevator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLucky13 {

	private Lucky13 testLucky13;

	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {

	}

	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {

	}

	@Before
	public void setup() {
		testLucky13 = new Lucky13();
	}

	@After
	public void teardown() {

	}

	@Test
	public void array_contains_one_or_three() {

		Assert.assertEquals(true, testLucky13.getLucky(new int[] { 0, 2, 5 }));
		Assert.assertEquals(false, testLucky13.getLucky(new int[] { 1, 3, 6, 7 }));
		Assert.assertEquals(false, testLucky13.getLucky(new int[] { 1, 2, 3, 4 }));

	}
}
