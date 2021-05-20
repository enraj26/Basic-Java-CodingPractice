
package com.codewithraju.xml.XLSXTOXML;

import java.util.Scanner;

import com.codewithraju.pojo.student;

public class main {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Excel Path : ");
		String filePath = sc.nextLine();
		System.out.println("Enter Student Id :");
		int id = Integer.parseInt(sc.nextLine());
		ReadExcelXLSX read = new ReadExcelXLSX();
		student studentById = read.getStudentById(id, filePath);
		WrtieXML write = new WrtieXML();
		write.saveStudent(studentById);
	}

}
