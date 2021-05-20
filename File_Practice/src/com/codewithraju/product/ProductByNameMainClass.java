package com.codewithraju.product;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductByNameMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Name");
		String pname = sc.nextLine();
		ExcelReaderByName productName = new ExcelReaderByName();
		ArrayList<Product> productsByName = productName.getProductsByName(pname);

		for (int i = 0; i < productsByName.size(); i++) {
			Product product = productsByName.get(i);
			System.out.println(product.id + "," + product.name + "," + product.price + "," + product.avail);
		}

		WriteFileByName writeFileExcel = new WriteFileByName();
		writeFileExcel.ExcelProductFile(productsByName);
		System.out.println("Excel Done...");
		writeFileExcel.writeProductFile(productsByName);
		System.out.println("File Done...");

	}

}
