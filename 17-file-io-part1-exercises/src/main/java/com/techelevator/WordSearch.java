package com.techelevator;

import java.util.Scanner;
import java.io.*;

//path to Alice in Wonderland: /Users/tekrimal/exercises/17-file-io-part1-exercises/alices_adventures_in_wonderland.txt
public class WordSearch {

public static void main(String[] args) {
  int lineNumber = 0;

  // Getting search word from user
  Scanner userInput = new Scanner(System.in);
  System.out.print("Please enter the word you're searching for:   ");
  String userWord = userInput.nextLine();
  String userAllCaps = userWord.toUpperCase();

  // Asking for case-sensitivity
  System.out.print("Is the word case-sensitive? Enter (Y)es or (N)o:   ");
  String caseCode = userInput.nextLine();

  // Getting path from user
  File inputFile = getInputFileFromUser();
  try (Scanner fileScanner = new Scanner(inputFile)) {
      while (fileScanner.hasNextLine()) {
          String line = fileScanner.nextLine();
          lineNumber++;
          if (caseCode.equals("Y") && line.contains(" " + userWord + " ")) {
              System.out.println(lineNumber + ") " + line);
          } else if (caseCode.equals("N")) {
              String allCapsLine = line.toUpperCase();
              if (allCapsLine.contains(" " + userAllCaps + " ")) {
                  System.out.println(lineNumber + ") " + line);
              }
          }
      }
  } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
  }

}

//Loop through file (while loop) for occurrences of the search word
//Make sure file exists and is not a directory
//While loop to go through each line

//File inputFile = getInputFileFromUser();

private static File getInputFileFromUser() {
  Scanner userInput = new Scanner(System.in);
  System.out.print("Please enter path to input file:  ");
  String path = userInput.nextLine();

  File inputFile = new File(path);
  if (inputFile.exists() == false) {
      System.out.println(path + " does not exist");
      System.exit(1);
  } else if (inputFile.isFile() == false) {
      System.out.println(path + " is not a file");
      System.exit(1);
  }
  return inputFile;
}
}