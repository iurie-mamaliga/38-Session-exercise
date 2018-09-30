package com.techelevator;

public class HomeworkAssignment {
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;   // {"A", "B", "C", "D", "F"};
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	public String letterGrade() {
		double percentGrade = (((double)this.totalMarks/(double)this.possibleMarks)*100);
		if(percentGrade >= 90) {
			return "A";
		}else if (percentGrade >= 80 && percentGrade <= 89) {
			return "B";
		} else if(percentGrade >= 70 && percentGrade <= 79) {
			return "C";
		}else if(percentGrade >= 60 && percentGrade <= 69) {
			return "D";
		}else {
			return "F";
		}
		
		
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public String getLetterGrade() {
		return this.letterGrade();
	}

	
	}
	


