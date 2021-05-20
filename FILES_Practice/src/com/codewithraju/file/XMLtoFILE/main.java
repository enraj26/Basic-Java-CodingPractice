package com.codewithraju.file.XMLtoFILE;

import java.util.ArrayList;

import com.codewithraju.pojo.student;

public class main {

	public static void main(String[] args) {

		// single student
			
/*		  ReadXML read = new ReadXML();
		  student students = read.getStudents();
		  
		  WriteFile write = new WriteFile(); 
		  write.saveStudent(students);*/
		 
		  // multipule students
		  
		MultiReadXML reads = new MultiReadXML();
		ArrayList<student> studentsList = reads.getStudents();
		
		WriteFile writes = new WriteFile();
		writes.saveMultiStudent(studentsList);
		
		// write xml console
		
		/*try {
			MultiReadXML reads = new MultiReadXML();
			ArrayList<student> studentsList = reads.getStudents();
			for(int i=0;i<studentsList.size();i++) {
				student std = studentsList.get(i);
			JAXBContext context2 = JAXBContext.newInstance(students.class);
			Marshaller createMarshaller = context2.createMarshaller();
			createMarshaller.setProperty(createMarshaller.JAXB_FORMATTED_OUTPUT, true);
			createMarshaller.marshal(std, System.out);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
	}

}
