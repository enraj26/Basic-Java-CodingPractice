package com.codewithraju.product;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {

	public ArrayList<Product> readExcelDate() {
		ArrayList<Product> productList = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("E:\\RAJU\\TEST\\b.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheetAt = wb.getSheetAt(0);
			int lastRowIndexNum = sheetAt.getLastRowNum();
			for (int i = 0; i <= lastRowIndexNum; i++) {
				HSSFRow row = sheetAt.getRow(i);
				HSSFCell cell0 = row.getCell(0);
				HSSFCell cell1 = row.getCell(1);
				HSSFCell cell2 = row.getCell(2);
				HSSFCell cell3 = row.getCell(3);
				Product p = new Product();
				p.id = (int) cell0.getNumericCellValue();
				p.name = cell1.getStringCellValue();
				p.price = cell2.getNumericCellValue();
				p.avail = (int) cell3.getNumericCellValue();
				productList.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

}
