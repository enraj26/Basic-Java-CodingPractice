package com.codewithraju.practicefiles;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {

	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("E:\\RAJU\\TEST\\a.txt", true);
			fr.write("\nBye Hello World.....");
			fr.close();
			System.out.println("Done......");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
