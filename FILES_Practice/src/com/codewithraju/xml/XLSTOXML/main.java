package com.codewithraju.xml.XLSTOXML;

import java.util.Scanner;

import com.codewithraju.pojo.student;

public class main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Excel Path...");
		String path = sc.nextLine();
		System.out.println("Enter Student id :");
		int sid  = Integer.parseInt(sc.nextLine());
		ReadExcelXLS read = new ReadExcelXLS();
		student std = read.getStudents(sid, path);
		WrtieXML write = new WrtieXML();
		write.saveStudent(std);
		
	}

}
