package com.codewithraju.excel.xlsx.fileTOxlsx;

import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class FileToExcelxlsxMain {

	public static void main(String[] args) {
		
		ReadFile rf = new ReadFile();
		ArrayList<product> pro = rf.getProduct();
		
		WriteExcelxlsx write = new WriteExcelxlsx();
		write.saveproduct(pro);
		
		System.out.println("Read Data From Text File To Write Excel xlsx....");
		
	}
	
	
}
