package com.techelevator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class TestMaxEnd3 {

	private MaxEnd3 testMaxEndThree;

	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {

	}

	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {

	}

	@Before
	public void setup() {
		testMaxEndThree = new MaxEnd3();
	}

	@After
	public void teardown() {

	}

	@Test
	public void test_if_1st_value_is_larger() {
		Assert.assertArrayEquals(new int[] { 4, 4, 4 }, testMaxEndThree.makeArray(new int[] { 4, 5, 2 }));
	}

	@Test
	public void test_if_3rd_value_is_larger() {
		int[] testInput = new int[] { 2, 5, 4 };
		int[] testOutputActual = testMaxEndThree.makeArray(testInput);
		int[] testOutputWanted = new int[] { 4, 4, 4 };
		Assert.assertArrayEquals(testOutputWanted, testOutputActual);

	}
}
