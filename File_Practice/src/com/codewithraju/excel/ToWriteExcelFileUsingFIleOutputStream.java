package com.codewithraju.excel;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ToWriteExcelFileUsingFIleOutputStream {
	
	public static void main(String[] args) {
		try {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		HSSFRow createRow = sheet.createRow(0);
		HSSFCell createCell = createRow.createCell(0);
		createCell.setCellValue("Say Hello....");
		
		HSSFCell createCell1 = createRow.createCell(1);
		createCell1.setCellValue("Bye Hello....");
		
		FileOutputStream fos = new FileOutputStream("E:\\RAJU\\TEST\\a.xls");
		workbook.write(fos);
		System.out.println("DONE....");
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
