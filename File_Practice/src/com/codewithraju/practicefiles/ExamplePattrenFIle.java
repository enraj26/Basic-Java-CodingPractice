package com.codewithraju.practicefiles;
import java.io.File;

public class ExamplePattrenFIle {

	public static void main(String[] args) {
		try {

			File file1 = new File("E:\\RAJU\\TEST\\A\\B\\D");
			File file2 = new File("E:\\RAJU\\TEST\\A\\B\\E");
			File file3 = new File("E:\\RAJU\\TEST\\A\\C");
			file1.mkdirs();
			file2.mkdirs();
			file3.mkdirs();

			File file4 = new File("E:\\RAJU\\TEST\\A\\B\\D\\d1.txt");
			File file5 = new File("E:\\RAJU\\TEST\\A\\B\\E\\e1.txt");
			File file6 = new File("E:\\RAJU\\TEST\\A\\C\\c1.txt");
			file4.createNewFile();
			file5.createNewFile();
			file6.createNewFile();
			
			System.out.println("Files Successfully Created....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
