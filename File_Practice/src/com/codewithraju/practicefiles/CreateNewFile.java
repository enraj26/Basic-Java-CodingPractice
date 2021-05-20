package com.codewithraju.practicefiles;
import java.io.File;
import java.util.Scanner;

public class CreateNewFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Path.......");
		String nextLine = sc.nextLine();
		File file = new File(nextLine);
		
		if (file.exists()) {
			System.out.println("File Alraedy Existed.....");
		} else {
			try {
				File parentFile = file.getParentFile();
				parentFile.mkdirs();
				file.createNewFile();
				System.out.println("File Created Successfully.....");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
