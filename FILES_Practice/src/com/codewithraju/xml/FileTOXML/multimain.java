package com.codewithraju.xml.FileTOXML;

import java.util.ArrayList;
import java.util.Scanner;

import com.codewithraju.pojo.student;

public class multimain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Path...");
		String file = sc.nextLine();
		/*System.out.println("Enter Student Name : ");
		String name  = sc.nextLine();*/
		System.out.println("Enter Student Marks : ");
		int marks = Integer.parseInt(sc.nextLine());
		
		ReadingFile read = new ReadingFile();
		/*ArrayList<student> students = read.getStudentsByName(file, name);*/
		ArrayList<student> students = read.getStudentsByMarks(file, marks);
		
		MultipuleWriteXML write = new MultipuleWriteXML();
		write.saveStudent(students);
	}

}
