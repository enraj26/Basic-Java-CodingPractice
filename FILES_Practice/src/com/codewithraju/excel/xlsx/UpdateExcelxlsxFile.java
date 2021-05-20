package com.codewithraju.excel.xlsx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codewithraju.pojo.product;

public class UpdateExcelxlsxFile {
	
	public String updatexlsxFile(product product) {
		try {
			
			FileInputStream fis = new FileInputStream("E:\\SIVA\\TEST\\product.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheetAt = wb.getSheetAt(0);
			int lastRowNum = sheetAt.getLastRowNum();
				XSSFRow createRow = sheetAt.createRow(lastRowNum+1);
				createRow.createCell(0).setCellValue(product.getId());
				createRow.createCell(1).setCellValue(product.getName());
				createRow.createCell(2).setCellValue(product.getPrice());
				createRow.createCell(3).setCellValue(product.getAvail());
				FileOutputStream fos  = new FileOutputStream("E:\\SIVA\\TEST\\product.xlsx");
				wb.write(fos);
				fos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}

}
