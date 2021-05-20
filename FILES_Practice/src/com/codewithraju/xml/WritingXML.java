package com.codewithraju.xml;

import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.codewithraju.pojo.student;

public class WritingXML {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id : ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter marks : ");
		int marks = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter avail : ");
		String qual = sc.nextLine();
		
		student s = new student();
		s.setId(id);
		s.setName(name);
		s.setMarks(marks);
		s.setQual(qual);
		
		try {
			JAXBContext context = JAXBContext.newInstance(student.class);
			Marshaller createMarshaller = context.createMarshaller();
			createMarshaller.marshal(s, new File("E:\\SIVA\\TEST.xml"));
			System.out.println("DONE...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	} 

}
