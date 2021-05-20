package com.codewithraju.file.XMLtoFILE;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import com.codewithraju.pojo.student;
import com.codewithraju.pojo.students;

public class WriteFile {

	public void saveStudent(student std) {

		try {
			FileWriter fw = new FileWriter("E:\\SIVA\\xmlTOfile.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(std.getId() + "," + std.getName() + "," + std.getMarks() + "," + std.getQual());
			bw.newLine();
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void saveMultiStudent(ArrayList<student> stdList) {

		try {
			FileWriter fw = new FileWriter("E:\\SIVA\\xmlTOnfile.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < stdList.size(); i++) {
				student std = stdList.get(i);
				bw.write(std.getId() + "," + std.getName() + "," + std.getMarks() + "," + std.getQual()
						+ "[Passport Details-- " + std.getPt().getId() + "," + std.getPt().getDoi() + ","
						+ std.getPt().getDoe());
				bw.newLine();
			}
			bw.newLine();
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
