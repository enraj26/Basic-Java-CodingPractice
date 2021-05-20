package com.codewithraju.practicefiles;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExamplePattrenFileUsingScanner {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many No Of File Paths You Enter.......");
		n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Folder Path :");
			String nextLine = sc1.nextLine();
			File file = new File(nextLine);
			if (file.exists()) {
				System.out.println("Enterd File Path Already Existed.....");
				System.out.println("Please Re-Enter File Path :");
				nextLine = sc1.nextLine();
				file = new File(nextLine);
			} else {
				File parentFile = file.getParentFile();
				parentFile.mkdirs();
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("File Paths Created Successfully");
	}

}
