package com.techelevator;

import org.junit.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestDateFashion {

	private DateFashion testDateFashion;

	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {

	}

	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {

	}

	@Before
	public void setup() {
		testDateFashion = new DateFashion();
	}

	@After
	public void teardown() {

	}

	@Test
	public void date_fashion_get_table() {

		Assert.assertEquals(2, testDateFashion.getATable(8, 4));
		Assert.assertEquals(2, testDateFashion.getATable(4, 8));
		Assert.assertEquals(0, testDateFashion.getATable(8, 2));
		Assert.assertEquals(0, testDateFashion.getATable(2, 8));
		Assert.assertEquals(1, testDateFashion.getATable(6, 3));

	}

}
