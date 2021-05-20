package com.codewithraju.practicefiles;
import java.io.File;

public class FileInformation {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Raju\\Desktop\\imp.txt");
		System.out.println("File Exist Or Not : "+file.exists());
		System.out.println("It Is a File : "+file.isFile());
		System.out.println("It Is a Directory : "+file.isDirectory());
		System.out.println("File Length In Bytes : "+file.length());
		System.out.println("Get Absolute Path :"+file.getAbsolutePath());
		System.out.println("Parent Class : "+file.getParent());
		System.out.println("File Last Modified Date : "+file.lastModified());
		System.out.println("---------------------------------------");
		File file2 = new File("C:\\Users\\Raju\\Desktop");
		System.out.println("File Exist Or Not : "+file2.exists());
		System.out.println("It Is a File : "+file2.isFile());
		System.out.println("It Is a Directory : "+file2.isDirectory());

	}

}
