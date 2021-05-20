package com.codewithraju.excel.xlsx.consoleTOxlsX;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codewithraju.pojo.account;

public class AccountWriter {

	public void saveAccount(account acc) {

		try {

			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet createSheet = wb.createSheet();
			XSSFRow createRow = createSheet.createRow(0);

			XSSFCell createCell = createRow.createCell(0);
			createCell.setCellValue(acc.getAccountNumber());

			XSSFCell createCell1 = createRow.createCell(1);
			createCell1.setCellValue(acc.getAccountName());

			XSSFCell createCell2 = createRow.createCell(2);
			createCell2.setCellValue(acc.getIfsc());

			XSSFCell createCell3 = createRow.createCell(3);
			createCell3.setCellValue(acc.getBranch());

			XSSFCell createCell4 = createRow.createCell(4);
			createCell4.setCellValue(acc.getBalance());

			FileOutputStream fos = new FileOutputStream("E:\\SIVA\\TEST\\account.xlsx");
			wb.write(fos);
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
