package com.codewithraju.practicefiles;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\RAJU\\TEST\\a.txt");
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			while (readLine != null) {
				System.out.println(readLine);
				readLine = br.readLine();
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
