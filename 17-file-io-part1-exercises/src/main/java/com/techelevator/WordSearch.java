package com.techelevator;

import java.util.Scanner;
import java.io.*;

//path to Alice in Wonderland: /Users/tekrimal/exercises/17-file-io-part1-exercises/alices_adventures_in_wonderland.txt

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {

		// Getting file from user
		try (Scanner userInput = new Scanner(System.in)) {
			File userFile;
			while (true) {
				System.out.println("Please enter the file path that should be searched  ==>  ");
				String filePath = userInput.nextLine();
				userFile = new File(filePath);
				if (userFile.exists() == false) {
					System.out.println(filePath + " Sorry, your file does not exist");
					continue;
				} else if (userFile.isFile() == false) {
					System.out.println(filePath + "Sorry, this is not a file");
					continue;
				}
				break;
			}
			// Getting the search word
			System.out.print("Please enter the search word you are looking for ==>   ");
			String userWord = userInput.nextLine();
			if ((userWord == null) || (userWord.isEmpty())) {
				System.out.println("The search word is not valid or it is empty");
				System.exit(1);
			}
			// Verifying case sensitive
			System.out.println("Should the search be case sensitive? (Y\\N)");
			boolean caseSensitive = userInput.nextLine().toLowerCase().equals("y");

			int lineNumber = 1;
			try (Scanner inputScanner = new Scanner(userFile.getAbsoluteFile())) {
				while (inputScanner.hasNextLine()) {
					String line = inputScanner.nextLine();
					if (caseSensitive == false) {
						if (line.toLowerCase().contains(userWord.toLowerCase())) {
							System.out.println(lineNumber + ") " + line);
						}
					} else {
						if (line.contains(userWord)) {
							System.out.println(lineNumber + ") " + line);
						}
					}
					lineNumber += 1;
				}
			}
		}

	}

}