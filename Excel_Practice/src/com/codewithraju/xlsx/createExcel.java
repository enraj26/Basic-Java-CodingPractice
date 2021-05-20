package com.codewithraju.xlsx;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createExcel {

	public static void main(String[] args) {

		try {
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet createSheet = wb.createSheet();
			XSSFRow createRow = createSheet.createRow(0);
			XSSFCell createCell = createRow.createCell(0);
			createCell.setCellValue("Hello World");
			
			XSSFCell createCell1 = createRow.createCell(1);
			createCell1.setCellValue("Bye Hello World");

			FileOutputStream fos = new FileOutputStream("E:\\SIVA\\TEST\\xlsx\\excel.xlsx");
			wb.write(fos);
			fos.close();
			System.out.println("DONE...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
