package com.codewithraju.pojo;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class students {

	private ArrayList<student> student;

	@XmlElement(name="student")
	public ArrayList<student> getStudents() {
		return student;
	}

	public void setStudents(ArrayList<student> students) {
		this.student = students;
	}

	
	
	
}
