package com.codewithraju.practicefiles;
import java.io.FileReader;

public class SmallCharctersInFile {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("E:\\RAJU\\text.txt");
			int read = fr.read();
			while (read != -1) {
				char ch = (char) read;
				/*if (ch >= 97 && ch <= 122) {
					System.out.print(ch);
				}*/
				if (ch >= 65 && ch <= 90) {
					System.out.print(ch);
				}
				if (!((ch >= 65 && ch <= 90) | (ch >= 97 && ch <= 122))){
					System.out.print(ch);
				}
				read = fr.read();
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
