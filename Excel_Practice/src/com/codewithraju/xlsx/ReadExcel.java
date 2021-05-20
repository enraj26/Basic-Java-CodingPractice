package com.codewithraju.xlsx;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("E:\\SIVA\\TEST\\xlsx\\new.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheetAt = wb.getSheetAt(0);
			int lastRowNum = sheetAt.getLastRowNum();

			for (int i = 0; i <= lastRowNum; i++) {
				XSSFRow row = sheetAt.getRow(i);
				XSSFCell cell = row.getCell(0);
				XSSFCell cell1 = row.getCell(1);
				System.out.println(cell + "," + cell1);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
