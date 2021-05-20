package com.codewithraju.file.FileTOFile;

import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class ReadWriteFileMain {
	
	public static void main(String[] args) {
		
		ReadFile read = new ReadFile();
		ArrayList<product> products = read.getProducts();
		
		WriterFile write = new WriterFile();
		write.saveProducts(products);
		
		System.out.println("File To File Data Transfered Successfully..");
		
	}

}
