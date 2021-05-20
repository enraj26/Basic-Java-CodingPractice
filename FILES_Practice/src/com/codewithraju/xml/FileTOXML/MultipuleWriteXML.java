package com.codewithraju.xml.FileTOXML;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.codewithraju.pojo.student;

public class MultipuleWriteXML {
	
	public void saveStudent(ArrayList<student> std) {
		try {
			student st = new student();
			st.setStd(std);
			JAXBContext context = JAXBContext.newInstance(student.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(st, System.out);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
