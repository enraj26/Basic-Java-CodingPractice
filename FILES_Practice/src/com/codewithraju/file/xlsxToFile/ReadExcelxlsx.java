package com.codewithraju.file.xlsxToFile;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codewithraju.pojo.product;

public class ReadExcelxlsx {

	public ArrayList<product> getProducts() {
		ArrayList<product> proList = new ArrayList();
		try {
			FileInputStream fis = new FileInputStream("E:\\SIVA\\TEST\\product.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheetAt = wb.getSheetAt(0);
			int lastRowNum = sheetAt.getLastRowNum();
			for(int i=0;i<=lastRowNum;i++) {
				XSSFRow row = sheetAt.getRow(i);
				XSSFCell cell0 = row.getCell(0);
				XSSFCell cell1 = row.getCell(1);
				XSSFCell cell2 = row.getCell(2);
				XSSFCell cell3 = row.getCell(3);
				product p = new product();
				p.setId((int) cell0.getNumericCellValue());
				p.setName(cell1.getStringCellValue());
				p.setPrice(cell2.getNumericCellValue());
				p.setAvail((int) cell3.getNumericCellValue());
				proList.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proList;
	}

}
