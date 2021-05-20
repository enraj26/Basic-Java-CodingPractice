package com.codewithraju.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.codewithraju.pojo.passport;
import com.codewithraju.pojo.phone;
import com.codewithraju.pojo.student;

public class MultipuleWriteXML {

	public static void main(String[] args) {

		ArrayList<student> stuList = new ArrayList<>();
		student s = new student();
		s.setId(11);
		s.setName("RAJU");
		s.setMarks(100);
		s.setQual("DEGREE");

		/*
		 * student s1 = new student(); s1.setId(22); s1.setName("SRINU");
		 * s1.setMarks(180); s1.setQual("DEGREE"); stuList.add(s); stuList.add(s1);
		 */

		passport pt = new passport();
		pt.setId(11);
		pt.setDoi("12-12-2011");
		pt.setDoe("12-12-2016");
		s.setPt(pt);

		ArrayList<phone> pnn = new ArrayList<>();
		phone pn = new phone();
		phone pn1 = new phone();
		pn.setId(123);
		pn.setNum(987773);
		pn1.setId(321);
		pn1.setNum(12345);
		pnn.add(pn);
		pnn.add(pn1);
		s.setPn(pnn);

		try {
			JAXBContext context = JAXBContext.newInstance(student.class);
			Marshaller createMarshaller = context.createMarshaller();
			createMarshaller.marshal(s, new File("E:\\SIVA\\TESTS.xml"));
			System.out.println("DONE...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
