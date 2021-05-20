package com.codewithraju.file.XMLtoFILE;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.codewithraju.pojo.student;

public class ReadXML {

	public student getStudents() {
		student std = new student();
		try {
			JAXBContext context = JAXBContext.newInstance(student.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Object unmarshal = unmarshaller.unmarshal(new File("E:\\SIVA\\TESTS.xml"));
			student st = (student) unmarshal;
			std.setId(st.getId());
			std.setName(st.getName());
			std.setMarks(st.getMarks());
			std.setQual(st.getQual());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}

}
