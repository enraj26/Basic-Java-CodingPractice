package com.codewithraju.practicefiles;
import java.io.FileReader;

public class ReadingTextFile {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\RAJU\\TEST\\a.txt");
			int read = fr.read();
			while (read != -1) {
				System.out.print((char) read);
				read = fr.read();
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
