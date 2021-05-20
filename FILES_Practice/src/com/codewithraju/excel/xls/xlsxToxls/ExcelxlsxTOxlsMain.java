package com.codewithraju.excel.xls.xlsxToxls;

import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class ExcelxlsxTOxlsMain {
	
	public static void main(String[] args) {
		
		ReadExcelxlsx readExcelFile = new ReadExcelxlsx(); 
		ArrayList<product> products = readExcelFile.getProducts();
		WriteExcelxls writeExcel = new WriteExcelxls();
		writeExcel.saveProducts(products);
		
		System.out.println("Read From Excel xlsx To Write xls........");
	}

}
