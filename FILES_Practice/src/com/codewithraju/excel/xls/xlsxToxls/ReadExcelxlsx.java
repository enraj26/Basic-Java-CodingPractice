package com.codewithraju.excel.xls.xlsxToxls;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codewithraju.pojo.product;

public class ReadExcelxlsx {

	public ArrayList<product> getProducts() {
		ArrayList<product> proList = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("E:\\SIVA\\TEST\\product.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheetAt = wb.getSheetAt(0);
			int lastRowNum = sheetAt.getLastRowNum();
			for (int i = 0; i < lastRowNum; i++) {
				XSSFRow row = sheetAt.getRow(i);
				product p = new product();
				p.setId((int) row.getCell(0).getNumericCellValue());
				p.setName(row.getCell(1).getStringCellValue());
				p.setPrice(row.getCell(2).getNumericCellValue());
				p.setAvail((int) row.getCell(3).getNumericCellValue());
				proList.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proList;
	}

}
