package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {

		String q1 = "What color is the sky?\n 1. Yellow\n 2. Green\n 3. Blue\n 4. red";
		String q2 = "A skeleton walks into a bar, and says to the bartender, \"Give me a beer and a ...\"\n1. hair brush\n2. dry erase marker\n3. mop\n4. yo-yo";
		String q3 = "What are Cleveland's odds of winning a championship?\n1. Not likely\n2. Highly likely\n3. Fat chance\n4. Who cares?? ";
		String q4 = "What is the capital city of Pennsylvania?\n1. Pittsburgh\n2. Harrisburgh\n3. Philadelphia\n4. Lancaster";
		String q5 = "What is the capital of USA?\n1. New York\n2. Washington\n3. Los Angeles\n4. Washington Dc*";

		Questions[] quiz = { new Questions(q1, "3"), new Questions(q2, "3"), new Questions(q3, "1"),
				new Questions(q4, "2"), new Questions(q5, "4") };

		takeQuiz(quiz);

	}

	public static void takeQuiz(Questions[] quiz) {

		int score = 0;

		for (int i = 0; i <= quiz.length - 1; i++) {
			Scanner userInput = new Scanner(System.in);
			System.out.println(quiz[i].questions);
			String answer = userInput.nextLine();
			if (answer.equals(quiz[i].answer)) {
				score++;
				System.out.println("That is correct");
				

			} else

				System.out.println("Sorry, incorrect");
				System.out.println();

		}
		System.out.println();
		System.out.println();
		System.out.println("Here is the solution of the quiz");
		System.out.println();
		File file = new File("test_quiz.txt");
		try {

			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println();

		System.out.println("You got" + " " + score + " " + "answer(s) correct out of the total" + " " + quiz.length
				+ " " + "questions asked");
	}

}
