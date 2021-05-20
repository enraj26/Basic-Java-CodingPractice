package com.codewithraju.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.codewithraju.pojo.phone;
import com.codewithraju.pojo.student;

public class ReadXMLFileArrayListData {
	
	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(student.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Object unmarshal = unmarshaller.unmarshal(new File("E:\\SIVA\\TEST\\TESTS.xml"));
			student std = (student) unmarshal; // down casting read data super class ref to sub class ref
			
			/*WrtieXML write = new WrtieXML(); writing data into another xml file
			write.saveStudent(std);*/
			ArrayList<phone> pn = std.getPn();
			for(int i=0;i<pn.size();i++) {
				phone phone = pn.get(i);
				System.out.println(phone.getId());
				System.out.println(phone.getNum());
				
			}
			System.out.println();
			System.out.println(std.getId());
			System.out.println(std.getName());
			System.out.println(std.getMarks());
			System.out.println(std.getQual());
			System.out.println(std.getPt().getId());
			System.out.println(std.getPt().getDoi());
			System.out.println(std.getPt().getDoe());
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
