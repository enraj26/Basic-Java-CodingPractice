package com.codewithraju.pojo;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class student {

	private int id;
	private String name;
	private int marks;
	private String qual;
	private ArrayList<student> std;
	private passport pt;
	private ArrayList<phone> pn;

	@XmlElement(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "marks")
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@XmlElement(name = "qual")
	public String getQual() {
		return qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	public ArrayList<student> getStd() {
		return std;
	}

	public void setStd(ArrayList<student> std) {
		this.std = std;
	}

	public passport getPt() {
		return pt;
	}

	public void setPt(passport pt) {
		this.pt = pt;
	}
	@XmlElementWrapper(name="phones")
	public ArrayList<phone> getPn() {
		return pn;
	}

	public void setPn(ArrayList<phone> pn) {
		this.pn = pn;
	}

}
