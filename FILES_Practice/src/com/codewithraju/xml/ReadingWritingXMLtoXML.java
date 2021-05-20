package com.codewithraju.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.codewithraju.pojo.student;
import com.codewithraju.xml.FileTOXML.WrtieXML;

public class ReadingWritingXMLtoXML {

	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(student.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Object unmarshal = unmarshaller.unmarshal(new File("E:\\SIVA\\SAITEST.xml"));
			student std = (student) unmarshal; // down casting read data super class ref to sub class ref
	
			/*WrtieXML write = new WrtieXML(); writing data into another xml file
			write.saveStudent(std);*/
			
			System.out.println(std.getId());
			System.out.println(std.getName());
			System.out.println(std.getMarks());
			System.out.println(std.getQual());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
