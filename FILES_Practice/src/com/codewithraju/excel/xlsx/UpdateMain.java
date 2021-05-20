package com.codewithraju.excel.xlsx;

import java.util.Scanner;

import com.codewithraju.pojo.product;

public class UpdateMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id : ");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("Enter Product Name : ");
		String name = sc.nextLine();

		System.out.println("Enter Product Price : ");
		double price = Double.parseDouble(sc.nextLine());

		System.out.println("Enter Product Avail : ");
		int avail = Integer.parseInt(sc.nextLine());

		UpdateExcelxlsxFile updateExcelxlsx = new UpdateExcelxlsxFile();
		product product = new product();
		product.setId(id);
		product.setName(name);
		product.setPrice(price);
		product.setAvail(avail);
		updateExcelxlsx.updatexlsxFile(product);
		System.out.println("Successfully Updated Excel xlsx File...");
	}

}
