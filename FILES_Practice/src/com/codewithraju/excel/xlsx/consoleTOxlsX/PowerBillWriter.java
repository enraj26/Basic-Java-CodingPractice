package com.codewithraju.excel.xlsx.consoleTOxlsX;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codewithraju.pojo.power;

public class PowerBillWriter {

	public void savePowerBill(power pow) {
		try {

			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet createSheet = wb.createSheet();
			XSSFRow createRow = createSheet.createRow(0);

			createRow.createCell(0).setCellValue(pow.getPreviousReading());
			createRow.createCell(1).setCellValue(pow.getCurrentReading());
			

			double previousReading = pow.getPreviousReading();
			double currentReading = pow.getCurrentReading();
			double unitRate = pow.getUnitRate();
			double total = currentReading - previousReading;

			if (total <= 99.0) {
				total = total * unitRate;
				createRow.createCell(2).setCellValue(unitRate);
			} else if (total > 100.0 && total < 200.0) {
				total = total * 10;
				createRow.createCell(2).setCellValue(10);
			} else if (total > 201.0 && total < 300.0) {
				total = total * 20;
				createRow.createCell(2).setCellValue(20);
			} else if (total > 301.0 && total < 400.0) {
				total = total * 30;
				createRow.createCell(2).setCellValue(30);
			} else if (total > 401.0 && total < 500.0) {
				total = total * 40;
				createRow.createCell(2).setCellValue(40);
			} else {
				total = total * 50;
				createRow.createCell(2).setCellValue(50);
			}
			createRow.createCell(3).setCellValue(total);
			FileOutputStream fos = new FileOutputStream("E:\\SIVA\\TEST\\powerbill.xlsx");
			wb.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
