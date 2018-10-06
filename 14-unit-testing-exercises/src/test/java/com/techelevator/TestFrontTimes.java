package com.techelevator;

import org.junit.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestFrontTimes {

	private FrontTimes theFrontThree;

	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {

	}

	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {

	}

	@Before
	public void setup() {
		theFrontThree = new FrontTimes();
	}

	@After
	public void teardown() {

	}

	@Test
	public void test_front_three_char() {

		Assert.assertEquals("chochocho", theFrontThree.generateString("chocolate", 3));
		Assert.assertEquals("TecTec", theFrontThree.generateString("Techelevator", 2));
		Assert.assertEquals("Tec", theFrontThree.generateString("Techelevator", 1));
		Assert.assertEquals("ofof", theFrontThree.generateString("of", 2));
		Assert.assertEquals("As", theFrontThree.generateString("As", 1));
		Assert.assertEquals("a", theFrontThree.generateString("a", 1));
		Assert.assertEquals("aaa", theFrontThree.generateString("a", 3));

	}
}
