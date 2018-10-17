package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;

public class FizzWriter {

	public static String fizzyBuzzy(int number) {

		Integer intInstance = new Integer(number);
		String value = intInstance.toString();

		if (number <= 0 || number >= 301) {
			return "";
		} else if ((number % 3 == 0 && number % 5 == 0) || (value.contains("3") && value.contains("5"))) {
			return "FizzBuzz";
		} else if (number % 5 == 0 || value.contains("5")) {
			return "Buzz";
		} else if (number % 3 == 0 || value.contains("3")) {
			return "Fizz";
		} else

			return value;
	}

	public static void main(String[] args) throws IOException {

		String fileSeparator = System.getProperty("file.separator");
		String absoluteFilePath = fileSeparator + "Users" + fileSeparator + "tekrimal" + fileSeparator + "exercises"
				+ fileSeparator + "18-file-io-part2-exercises" + fileSeparator + "FizzBuzz.txt";
		File file = new File(absoluteFilePath);

		if (file.createNewFile()) {
			System.out.println(absoluteFilePath + " File Created");
		} else
			System.out.println("File " + absoluteFilePath + " already exists");

		try {

			// creating a print writer for writing to a file
			PrintWriter write = new PrintWriter(new FileWriter("FizzBuzz.txt"));
			for(int j = 1; j<= 300; j++) {
			write.println(fizzyBuzzy(j));
			}

			write.flush();

		} catch (IOException e1) {
			System.out.println("Error during reading/writing");
		}

		System.out.println();
		System.out.println("name: " + file.getName());
		System.out.println("absolutePath: " + file.getAbsolutePath());
		System.out.println("size : " + file.length());
	}
}
