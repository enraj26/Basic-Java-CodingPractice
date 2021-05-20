package com.codewithraju.practicefiles;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class SaveFileAndBufferWriterUsingScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("Enter Name : ");
		String name = sc.nextLine();

		System.out.println("Enter Age : ");
		int age = Integer.parseInt(sc.nextLine());

		System.out.println("Enter Qualfication : ");
		String qul = sc.nextLine();

		TestFileAndBufferWriterUsingScanner test = new TestFileAndBufferWriterUsingScanner();
		test.saveStudent(id, name, age, qul);

	}

}
