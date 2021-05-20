package com.codewithraju.practicefiles;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderAndWriter {

	public static void main(String[] args) {

		try {
			File file = new File("E:\\RAJU\\TEST\\a.txt");
			FileReader fr = new FileReader(file);
			int read = fr.read();
			FileWriter fw = new FileWriter("E:\\RAJU\\TEST\\b.txt");
			while (read != -1) {
				char ch = (char) read;
				read = fr.read();
				fw.write(ch);
			}
			fw.close();
			fr.close();
			System.out.println("Done...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
