package com.codewithraju.file.xlsTOFile;

import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class ReadxlsToWriteFileMain {

	public static void main(String[] args) {

		ReadExcelxls read = new ReadExcelxls();
		ArrayList<product> products = read.getProducts();
		
		WritingFile write = new WritingFile();
		write.saveProducts(products);
		
		System.out.println("Read Excel xls To Write Text File");
		
	}

}
