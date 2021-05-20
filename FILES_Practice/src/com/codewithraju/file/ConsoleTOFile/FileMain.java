package com.codewithraju.file.ConsoleTOFile;

import java.util.ArrayList;
import java.util.Scanner;

import com.codewithraju.pojo.student;

public class FileMain {
	
	public static void main(String[] args) {
		ArrayList<student> stuList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Student Info You Have.......");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++) {
			System.out.println("Enter Student Id....");
			int id = Integer.parseInt(sc.nextLine());

			System.out.println("Enter Student Name....");
			String name = sc.nextLine();

			System.out.println("Enter Student Marks.....");
			int marks = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Student Qualfication....");
			String qual = sc.nextLine();

			student stu = new student();
			stu.setId(id);
			stu.setName(name);
			stu.setMarks(marks);
			stu.setQual(qual);
			stuList.add(stu);
		}
		MultipuleFileWriter writer = new MultipuleFileWriter();
		writer.saveStudentInfo(stuList);
		System.out.println("Multipule Rows Saved in Console To Write Text File.......");
	}

}
