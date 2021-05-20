package com.codewithraju.practicefiles;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderNoOfWortdsAboveFour {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("E:\\RAJU\\TEST\\a.txt");
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			int count = 0;
			int wordcount = 0;
			int lineCount = 0;
			while (readLine != null) {
				
				// line length above 2
				if (readLine.length() > 2) {
					lineCount++;
				}
				
				// greater then 3 words in given line
				if (readLine.split(" ").length > 3) {
					wordcount++;
				}
				
				// greater then 4 word charcters in given file
				String[] split = readLine.split(" ");
				for (int i = 0; i < split.length; i++) {
					if (split[i].length() >= 4) {
						count++;
					}
				}

				readLine = br.readLine();
			}
			System.out.println(lineCount);
			System.out.println(wordcount);
			System.out.println(count);
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
