package com.codewithraju.file.xlsTOFile;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.codewithraju.pojo.product;

public class ReadExcelxls {
	
	public ArrayList<product> getProducts() {
		ArrayList<product> proList = new ArrayList<>();
		try {
			FileInputStream fis  = new FileInputStream("E:\\SIVA\\TEST\\product.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheetAt = wb.getSheetAt(0);
			int rowNum = sheetAt.getLastRowNum();
			for(int i=0;i<=rowNum;i++) {
				HSSFRow row = sheetAt.getRow(i);
				HSSFCell cell0 = row.getCell(0);
				HSSFCell cell1 = row.getCell(1);
				HSSFCell cell2 = row.getCell(2);
				HSSFCell cell3 = row.getCell(3);
				product p = new product();
				System.out.println(cell0.getNumericCellValue());
				p.setId((int) cell0.getNumericCellValue());
				p.setName(cell1.getStringCellValue());
				p.setPrice(cell2.getNumericCellValue());
				p.setAvail((int) cell3.getNumericCellValue());
				proList.add(p);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return proList;
	}

}
