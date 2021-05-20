package com.codewithraju.file.xlsxToFile;

import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class ExcelxlsxToFileMain {
	
	public static void main(String[] args) {
		
		ReadExcelxlsx read = new ReadExcelxlsx();
		ArrayList<product> products = read.getProducts();
		
		WriteTextFile write  = new WriteTextFile();
		write.saveProducts(products);
		
		System.out.println("Excel xlsx To File Data Transfer Successfully");
		
	}

}
