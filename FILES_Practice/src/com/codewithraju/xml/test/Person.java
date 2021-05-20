package com.codewithraju.xml.test;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	private int id;
	private String name;
	private int marks;
	private ArrayList<Address> add;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public ArrayList<Address> getAdd() {
		return add;
	}

	public void setAdd(ArrayList<Address> add) {
		this.add = add;
	}

}
