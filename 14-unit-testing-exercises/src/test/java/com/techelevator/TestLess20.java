package com.techelevator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class TestLess20 {

	private Less20 theLess20;

	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {

	}

	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {

	}

	@Before
	public void setup() {
		theLess20 = new Less20();
	}

	@After
	public void teardown() {

	}

	@Test
	public void test_less_one_or_two() {

		Assert.assertEquals(true, theLess20.isLessThanMultipleOf20(18));
		Assert.assertEquals(true, theLess20.isLessThanMultipleOf20(19));
		Assert.assertEquals(false, theLess20.isLessThanMultipleOf20(20));
		Assert.assertEquals(true, theLess20.isLessThanMultipleOf20(39));
		Assert.assertEquals(true, theLess20.isLessThanMultipleOf20(38));
		Assert.assertEquals(false, theLess20.isLessThanMultipleOf20(21));
		Assert.assertEquals(false, theLess20.isLessThanMultipleOf20(41));

	}
}
