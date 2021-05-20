package com.codewithraju.excel.xls.fileTOxls;

import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class FileToExcelxlsMain {
	
	public static void main(String[] args) {
		
		ReadTextFile read = new ReadTextFile();
		ArrayList<product> products = read.getProducts();
		
		WriteExcelxls write  = new WriteExcelxls();
		write.saveProducts(products);
		
		System.out.println("File To Excel xls Data transfered Successfully..");
	}

}
