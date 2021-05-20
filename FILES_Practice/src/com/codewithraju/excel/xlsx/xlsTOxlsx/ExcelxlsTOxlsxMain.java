package com.codewithraju.excel.xlsx.xlsTOxlsx;

import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class ExcelxlsTOxlsxMain {

	public static void main(String[] args) {

		ReadExcelxls readExcel = new ReadExcelxls();
		ArrayList<product> products = readExcel.getProducts();
		WriteExcelxlsx writeExcel = new WriteExcelxlsx();
		writeExcel.saveProducts(products);
		System.out.println("Read Data From Excel xls to Write Excel xlsx....");

	}

}
