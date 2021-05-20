package com.codewithraju.product;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReaderByName {

	public ArrayList<Product> getProductsByName(String pname) {
		ArrayList<Product> proList = new ArrayList<>();
		
		try {
			FileInputStream fis = new FileInputStream("E:\\RAJU\\TEST\\b.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheetAt = wb.getSheetAt(0);
			int lastRowNum = sheetAt.getLastRowNum();
			
			for (int i = 0; i <= lastRowNum; i++) {
				HSSFRow row = sheetAt.getRow(i);
				HSSFCell cell = row.getCell(0);
				HSSFCell cell1 = row.getCell(1);
				HSSFCell cell2 = row.getCell(2);
				HSSFCell cell3 = row.getCell(3);
				
				if (cell1.getStringCellValue().startsWith(pname)) {
					Product p = new Product();
					p.id = (int) cell.getNumericCellValue();
					p.name = cell1.getStringCellValue();
					p.price = cell2.getNumericCellValue();
					p.avail = (int) cell3.getNumericCellValue();
					proList.add(p);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proList;
	}

}
