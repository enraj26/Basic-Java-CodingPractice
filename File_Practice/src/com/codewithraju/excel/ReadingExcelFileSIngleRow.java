package com.codewithraju.excel;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadingExcelFileSIngleRow {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("E:\\RAJU\\TEST\\b.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheetAt = wb.getSheetAt(0);
			HSSFRow row = sheetAt.getRow(0);
			HSSFCell cell = row.getCell(0);
			HSSFCell cell1 = row.getCell(1);
			HSSFCell cell2 = row.getCell(2);
			HSSFCell cell3 = row.getCell(3);

			System.out.println(cell.getNumericCellValue());
			System.out.println(cell1.getStringCellValue());
			System.out.println(cell2.getStringCellValue());
			System.out.println(cell3.getNumericCellValue());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
