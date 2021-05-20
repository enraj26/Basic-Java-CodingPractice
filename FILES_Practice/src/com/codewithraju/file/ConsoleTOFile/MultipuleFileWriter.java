package com.codewithraju.file.ConsoleTOFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import com.codewithraju.pojo.student;

public class MultipuleFileWriter {
	
	public void saveStudentInfo(ArrayList<student> stuList) {
		try {
			FileWriter fw = new FileWriter("E:\\SIVA\\TEST\\student.txt",true);
			BufferedWriter bw  = new BufferedWriter(fw);
			for(int i=0;i<stuList.size();i++) {
				student student = stuList.get(i);
				bw.write(student.getId()+","+student.getName()+","+student.getMarks()+","+student.getQual());
				bw.newLine();
			}
				bw.close();
				fw.close();
		}
		catch(Exception e) {
			
		}
	}

}
