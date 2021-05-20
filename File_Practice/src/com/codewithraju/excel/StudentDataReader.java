package com.codewithraju.excel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentDataReader {
	
	public ArrayList<Student> getStudents() {
		ArrayList<Student> studentList = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader("E:\\RAJU\\TEST\\a.txt");
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			while(readLine != null) {
				String[] split = readLine.split(",");
					Student std = new Student();
					std.id = Integer.parseInt(split[0]);
					std.name = split[1];
					std.qual = split[2];
					std.marks = Integer.parseInt(split[3]);
					studentList.add(std);
					readLine = br.readLine();
			}
			br.close();
			fr.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}
	
}
