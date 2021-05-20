package com.codewithraju.excel.xls;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Createxls {

	public static void main(String[] args) {

		try {
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet createSheet = wb.createSheet();
			HSSFRow createRow = createSheet.createRow(0);
			HSSFCell createCell = createRow.createCell(0);
			createCell.setCellValue("Hello World");

			HSSFCell createCell1 = createRow.createCell(1);
			createCell1.setCellValue("Bye Hello World");

			FileOutputStream fos = new FileOutputStream("E:\\SIVA\\TEST\\test.xls");
			wb.write(fos);
			fos.close();
			System.out.println("DONE...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
