package com.codewithraju.product;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		ExcelReader excelReader = new ExcelReader();
		ArrayList<Product> readExcelDate = excelReader.readExcelDate();
		FileWriting fileWriting = new FileWriting();
		fileWriting.writeTextFile(readExcelDate);

	}

}
