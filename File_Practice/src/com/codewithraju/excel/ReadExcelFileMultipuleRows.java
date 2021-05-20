package com.codewithraju.excel;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelFileMultipuleRows {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("E:\\RAJU\\TEST\\b.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheetAt = wb.getSheetAt(0);
			int lastRowNum = sheetAt.getLastRowNum();
			
			for (int i = 0; i <= lastRowNum; i++) {
				HSSFRow row = sheetAt.getRow(i);
				HSSFCell cell = row.getCell(0);
				HSSFCell cel1 = row.getCell(1);
				HSSFCell cel2 = row.getCell(2);
				HSSFCell cel3 = row.getCell(3);
				System.out.println(cell.getNumericCellValue());
				System.out.println(cel1.getStringCellValue());
				System.out.println(cel2.getStringCellValue());
				System.out.println(cel3.getNumericCellValue());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
