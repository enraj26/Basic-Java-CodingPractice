package com.codewithraju.practicefiles;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Stream;

public class BufferReaderNoOfWords {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("E:\\RAJU\\TEST\\a.txt");
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			System.out.println(readLine);
			int scount = 0;
			while (readLine != null) {
				String[] split = readLine.split(" ");
				scount = scount + split.length;
				readLine = br.readLine();
			}
			System.out.println(scount);
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
