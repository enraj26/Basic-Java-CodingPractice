package com.codewithraju.basicpractice;

public class Average {

	public static void main(String[] args) {

		int marks1 = 50;
		int marks2 = 29;
		int marks3 = 55;
		int marks4 = 60;
		int marks5 = 70;
		int total = marks1 + marks2 + marks3 + marks4 + marks5;
		int avg = total / 5;
		int max = 75 * 5;
		int Percentage = total * 100 / max;

		System.out.println("Total Marks ::" + total);
		System.out.println("Average ::" + avg);
		System.out.println("Percenatage ::" + Percentage);

		if (Percentage < 35) {
			System.out.println("GRADE : Fail");
		} else if (Percentage >= 35 & Percentage < 40) {
			System.out.println("GRADE : Pass");
		} else if (Percentage >= 40 & Percentage < 50) {
			System.out.println("GRADE : Third Class");
		} else if (Percentage >= 50 & Percentage < 60) {
			System.out.println("GRADE : Second Class");
		} else if (Percentage >= 60 & Percentage < 70) {
			System.out.println("GRADE : First Class");
		} else {
			System.out.println("GRADE : Distinction");
		}

	}

}
