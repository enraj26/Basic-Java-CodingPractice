package com.codewithraju.xml.XLSXTOXML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.codewithraju.pojo.student;

public class WrtieXML {

	public void saveStudent(student std) {

		try {
			JAXBContext context = JAXBContext.newInstance(student.class);
			Marshaller createMarshaller = context.createMarshaller();
			createMarshaller.setProperty(createMarshaller.JAXB_FORMATTED_OUTPUT, true);
			createMarshaller.marshal(std, new File("E:\\SIVA\\excelXLSXTOXML.xml"));
			System.out.println("DONE...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
