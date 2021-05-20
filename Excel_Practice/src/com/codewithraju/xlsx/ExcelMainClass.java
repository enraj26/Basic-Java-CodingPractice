package com.codewithraju.xlsx;

import java.util.ArrayList;

public class ExcelMainClass {
	
	public static void main(String[] args) {
		
		ReadExcelXls exc = new ReadExcelXls();
		ArrayList<product> readExcelXlsFile = exc.readExcelXlsFile();
		System.out.println(readExcelXlsFile.size());
	}

}
