package com.codewithraju.xml.FileTOXML;

import java.io.BufferedReader;
import java.io.FileReader;

import com.codewithraju.pojo.student;

public class ReadTextFile {

	public student getStudentById(int id,String fileName) {
		student std = new student();

		try {
		
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			while (readLine != null) {
				String[] split = readLine.split(",");
				int sid = Integer.parseInt(split[0]);
				if (id == sid) {
					std.setId(id);
					std.setName(split[1]);
					std.setMarks(Integer.parseInt(split[2]));
					std.setQual(split[3]);
					break;
				}
				readLine = br.readLine();
				br.close();
				fr.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}

}
