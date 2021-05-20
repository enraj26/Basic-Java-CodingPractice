package com.codewithraju.practicefiles;
import java.util.ArrayList;
import java.util.Scanner;

public class MulitipuleFilesMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Path1....");
		String file1 = sc.nextLine();
		System.out.println("Enter File Path2....");
		String file2 = sc.nextLine();
		System.out.println("Enter File Path3....");
		String file3 = sc.nextLine();
		
		String[] arr = new String[3];
		arr[0] = file1;
		arr[1] = file2;
		arr[2] = file3;
		
		GetDataFromMultipuleFiles rmf = new GetDataFromMultipuleFiles();
		ArrayList<String> data = rmf.getData(arr);
		for(int i=0;i<data.size();i++) {
			System.out.println(data.get(i));
		}
	}

}
