package com.codewithraju.basicpractice;

public class Condition1 {

	public static void main(String[] args) {

		int marks = -45;
		if (marks < 35) {
			System.out.println("FAIL");
		} else if (marks >= 35 & marks < 45) {
			System.out.println("PASS");
		} else if (marks >= 45 & marks < 60) {
			System.out.println("THIRD CLASS");
		} else if (marks >= 60 & marks < 75) {
			System.out.println("SECOND CLASS");
		} else if (marks >= 75 & marks < 80) {
			System.out.println("FIRST CLASS");
		} else {
			System.out.println("DISTINCTION");
		}
	}

}
