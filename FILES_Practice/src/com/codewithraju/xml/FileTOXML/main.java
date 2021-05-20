package com.codewithraju.xml.FileTOXML;

import java.util.Scanner;

import com.codewithraju.pojo.student;

public class main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Path :");
		String path = sc.nextLine();
		System.out.println("Enter Student Id : ");
		int sid = Integer.parseInt(sc.nextLine());
		ReadTextFile text = new ReadTextFile();
		student studentById = text.getStudentById(sid,path);
		WrtieXML write = new WrtieXML();
		write.saveStudent(studentById);
	}
}
