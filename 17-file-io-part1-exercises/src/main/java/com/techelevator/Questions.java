package com.techelevator;

public class Questions {
	
	String questions;
	String answer;
	
	
	Questions(String questions, String answer) {
		this.questions = questions;
		this.answer = answer;
	}
	
}
	
	
	/*
	public Questions(String line) {
		if(line != null && line.equals("")) {
			String[] parts = line.split("\\|");
			
			this.question = parts[0];
			for(int i = 0; i < parts.length; i++) {
				String answer = parts[i].trim();
				
				if(answer.endsWith("*")) {
					answer = answer.substring(0, answer.length() - 1);
					this.correctAnswer = answer;
				}
				this.answer[i - 1] = answer;
			}
			
		}
		
	}
	
	public Questions(String entry, String answers) {
		this.entry = entry;
		this.answers = answers;
	}
}
*/