package com.codewithraju.account;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterAccount {

	public void writingExcelXlsxFile(Account account) {

		try {
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet createSheet = wb.createSheet();
			XSSFRow createRow = createSheet.createRow(0);
			createRow.createCell(0).setCellValue(account.getAccountNo());
			createRow.createCell(1).setCellValue(account.getAccountName());
			createRow.createCell(2).setCellValue(account.getIfsc());
			createRow.createCell(3).setCellValue(account.getBranch());
			createRow.createCell(4).setCellValue(account.getBalance());
			FileOutputStream fos = new FileOutputStream("E:\\SIVA\\TEST\\xlsx\\excel.xlsx");
			wb.write(fos);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
