package com.techelevator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class AnimalGroupNameTest {

	private AnimalGroupName testAnimalGroupName;

	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {

	}

	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {

	}

	@Before
	public void setup() {
		testAnimalGroupName = new AnimalGroupName();
	}

	@After
	public void teardown() {

	}

	@Test
	public void get_Herd_for_animals_test() {
		String animalName = "Crow";

		String groupName = testAnimalGroupName.getHerd(animalName);
		Assert.assertEquals("Murder", groupName);

	}

	@Test
	public void animal_herd_uppercase_test() {
		String animalName = "Giraffe".toUpperCase();

		String groupName = testAnimalGroupName.getHerd(animalName);
		Assert.assertEquals("Tower", groupName);

	}

	@Test
	public void animal_group_lowercase_test() {
		String animalName = "Elephant".toLowerCase();

		String groupName = testAnimalGroupName.getHerd(animalName);
		Assert.assertEquals("Herd", groupName);
	}

	@Test
	public void animal_group_unknown_lowercase_test() {
		String animalName = "walrus".toLowerCase();

		String groupName = testAnimalGroupName.getHerd(animalName);
		Assert.assertEquals("unknown", groupName);
	}

	@Test
	public void animal_group_unknown_uppercase_test() {
		String animalName = "walrus".toUpperCase();

		String groupName = testAnimalGroupName.getHerd(animalName);
		Assert.assertEquals("unknown", groupName);
	}

	public void animal_group_emptytest() {
		String animalName = "";

		String groupName = testAnimalGroupName.getHerd(animalName);
		Assert.assertEquals("unknown", groupName);
	}

	@Test
	public void animal_group_null_test() {
		String animalName = null;

		String groupName = testAnimalGroupName.getHerd(animalName);
		Assert.assertEquals("unknown", groupName);
	}

}
