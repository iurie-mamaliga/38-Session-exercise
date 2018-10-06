package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class CigarPartyTest {

	private CigarParty cigarPartyTest;

	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {

	}

	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {

	}

	@Before
	public void setup() {
		cigarPartyTest = new CigarParty();
	}

	@After
	public void teardown() {

	}

	@Test
	public void cigar_party_success() {

		Assert.assertEquals(false, cigarPartyTest.haveParty(30, false));
		Assert.assertEquals(true, cigarPartyTest.haveParty(50, false));
		Assert.assertEquals(true, cigarPartyTest.haveParty(70, true));
		Assert.assertEquals(false, cigarPartyTest.haveParty(70, false));
		Assert.assertEquals(false, cigarPartyTest.haveParty(30, true));
		Assert.assertEquals(true, cigarPartyTest.haveParty(40, true));

	}

}
