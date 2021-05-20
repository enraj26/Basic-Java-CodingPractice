package com.codewithraju.excel.xls;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.codewithraju.pojo.product;

public class UpdateExcelxlsFile {

	public void updateExcelxls(product product) {
	try {
		FileInputStream fis = new FileInputStream("E:\\SIVA\\TEST\\product.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheetAt = wb.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
			HSSFRow createRow = sheetAt.createRow(lastRowNum+1);
			createRow.createCell(0).setCellValue(product.getId());
			createRow.createCell(1).setCellValue(product.getName());
			createRow.createCell(2).setCellValue(product.getPrice());
			createRow.createCell(3).setCellValue(product.getAvail());
			FileOutputStream fos = new FileOutputStream("E:\\SIVA\\TEST\\product.xls");
			wb.write(fos);
			fis.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

}
