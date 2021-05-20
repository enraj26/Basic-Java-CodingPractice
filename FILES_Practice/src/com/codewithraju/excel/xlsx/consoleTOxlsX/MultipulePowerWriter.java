package com.codewithraju.excel.xlsx.consoleTOxlsX;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codewithraju.pojo.power;

public class MultipulePowerWriter {

	public void saveMultipulePowerBills(ArrayList<power> pow) {

		try {
			FileOutputStream fis = new FileOutputStream("E:\\SIVA\\TEST\\multipulepowerbills.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet();
			for (int i = 0; i <pow.size(); i++) {
				XSSFRow row = sheet.createRow(i);
				power power = pow.get(i);
				row.createCell(0).setCellValue(power.getPreviousReading());
				row.createCell(1).setCellValue(power.getCurrentReading());
				row.createCell(2).setCellValue(power.getUnitRate());
				double previousReading = power.getPreviousReading();
				double currentReading = power.getCurrentReading();
				double unitRate = power.getUnitRate();
				double bill = (currentReading - previousReading) * unitRate;
				row.createCell(3).setCellValue(bill);
				wb.write(fis);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
