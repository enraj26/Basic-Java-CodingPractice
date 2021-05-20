package com.codewithraju.DataTransferways;

import java.util.ArrayList;
import java.util.Scanner;

public class SingleValueToMultipuleSingleValues {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Color : ");
		String proColor = sc.nextLine();
		
		ReadProducts read = new ReadProducts();
		ArrayList<String> readProductsBycolor = read.readProductsBycolor(proColor);
		System.out.print(readProductsBycolor);
	}

}
