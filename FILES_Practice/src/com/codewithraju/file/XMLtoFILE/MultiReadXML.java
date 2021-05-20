package com.codewithraju.file.XMLtoFILE;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.codewithraju.pojo.passport;
import com.codewithraju.pojo.phone;
import com.codewithraju.pojo.student;
import com.codewithraju.pojo.students;

public class MultiReadXML {

	public ArrayList<student> getStudents() {
		ArrayList<student> list = new ArrayList<>();
		try {
			JAXBContext context = JAXBContext.newInstance(students.class);
			Unmarshaller createUnmarshaller = context.createUnmarshaller();
			Object unmarshal = createUnmarshaller.unmarshal(new File("E:\\SIVA\\TESTS.xml"));
			students std = (students) unmarshal;

			ArrayList<student> students = std.getStudents();

			for (int i = 0; i < students.size(); i++) {
				student student = students.get(i);

				student st = new student();
				st.setId(student.getId());
				st.setName(student.getName());
				st.setMarks(student.getMarks());
				st.setQual(student.getQual());

				passport pt = new passport();
				pt.setId(student.getPt().getId());
				pt.setDoi(student.getPt().getDoi());
				pt.setDoe(student.getPt().getDoe());
				st.setPt(pt);

				ArrayList<phone> pn = student.getPn();
				ArrayList<phone> phne = new ArrayList<>();
				for (int p = 0; p <pn.size(); p++) {
					phone phn = new phone();
					phone phone = pn.get(p);
					phn.setId(phone.getId());
					phn.setName(phone.getName());
					phn.setNum(phone.getNum());
					System.out.println(phone.getNum());
					phne.add(phn);
				}
				st.setPn(phne);
				list.add(st);

			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
