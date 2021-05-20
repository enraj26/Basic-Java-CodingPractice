package com.codewithraju.practicefiles;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderNoOfLines {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("E:\\RAJU\\TEST\\a.txt");
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			int count = 0;
			while (readLine != null) {
				count++;
				readLine = br.readLine();
			}
			System.out.println(count);
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
