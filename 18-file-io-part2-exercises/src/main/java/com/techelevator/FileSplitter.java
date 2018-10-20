package com.techelevator;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileSplitter {

	public static void main(String[] args) throws FileNotFoundException {
		
		args = new String[] {"Users/tekrimal/exercises/17-file-io-part1-exercises/alices_adventures_in_wonderland.txt\n" +  "100"};
		
		File masterFile = new File(args[0]);
		
		Scanner inputFileStream = null;
		inputFileStream = new Scanner(masterFile);
		
		PrintWriter outputFileStream = null;
		
		
		String baseName = "index";
		int outputFileCounter = 1;
		String extension = ".txt";
		
		outputFileStream = new PrintWriter(baseName + outputFileCounter + extension);
		
		int breakPoint = Integer.parseInt(args[1]);
		for(int lineCount = 1; inputFileStream.hasNextLine(); lineCount++) {
			String currentLine = inputFileStream.nextLine();
			
			if(lineCount < breakPoint) {
				outputFileStream.println(currentLine);
				
			} else {
				
				//Create a new file
				outputFileCounter++;
				
				outputFileStream.flush();
				outputFileStream.close();
				
				outputFileStream = new PrintWriter(baseName + outputFileCounter + extension);
				
				//reset counter
				lineCount = 1;
				
			}
			
		}
		
		
		inputFileStream.close();
		
		outputFileStream.flush();
		outputFileStream.close();

	}

}
