package com.codewithraju.practicefiles;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TestFileAndBufferWriterUsingScanner {

	void saveStudent(int id, String name, int age, String qul) {
		try {

			FileWriter fw = new FileWriter("E:\\RAJU\\TEST\\b.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(id + "," + name + "," + age + "," + qul);
			bw.close();
			fw.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
