package com.codewithraju.xml.FileTOXML;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.codewithraju.pojo.student;

public class ReadingFile {

	public ArrayList<student> getStudentsByName(String file, String name) {
		ArrayList<student> stdList = new ArrayList<>();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			while (readLine != null) {
				String[] split = readLine.split(",");
				if (name.equals(split[1])) {
					student std = new student();
					std.setId(Integer.parseInt(split[0]));
					std.setName(split[1]);
					std.setMarks(Integer.parseInt(split[2]));
					std.setQual(split[3]);
					stdList.add(std);
				}
				readLine = br.readLine();
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stdList;
	}

	
	public ArrayList<student> getStudentsByMarks(String file, int marks) {
		ArrayList<student> stdList = new ArrayList<>();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			while (readLine != null) {
				String[] split = readLine.split(",");
				if (marks == Integer.parseInt(split[2])) {
					student std = new student();
					std.setId(Integer.parseInt(split[0]));
					std.setName(split[1]);
					std.setMarks(Integer.parseInt(split[2]));
					std.setQual(split[3]);
					stdList.add(std);
				}
				readLine = br.readLine();
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stdList;
	}
	
}
