package com.techelevator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class TestSameFirstLast {

	private SameFirstLast testSameStartEnd;

	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {

	}

	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {

	}

	@Before
	public void setup() {
		testSameStartEnd = new SameFirstLast();
	}

	@After
	public void teardown() {

	}

	@Test
	public void first_last_equals() {

		Assert.assertEquals(true, testSameStartEnd.isItTheSame(new int[] { 1, 2, 3, 1 }));
		Assert.assertEquals(true, testSameStartEnd.isItTheSame(new int[] { 1, 4, 1 }));
		Assert.assertEquals(false, testSameStartEnd.isItTheSame(new int[] { 1, 5, 7 }));
		Assert.assertEquals(false, testSameStartEnd.isItTheSame(new int[] { 0, 1 }));
		Assert.assertEquals(true, testSameStartEnd.isItTheSame(new int[] { 3, 3 }));
		Assert.assertEquals(false, testSameStartEnd.isItTheSame(new int[] {}));

	}

}
