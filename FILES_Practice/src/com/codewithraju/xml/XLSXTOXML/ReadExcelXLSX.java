package com.codewithraju.xml.XLSXTOXML;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codewithraju.pojo.student;

public class ReadExcelXLSX {

	public student getStudentById(int id, String path) {
		student std = new student();
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			int lastRowNum = sheet.getLastRowNum();
			for (int i = 0; i < lastRowNum; i++) {
				XSSFRow row = sheet.getRow(i);

				XSSFCell cell = row.getCell(0);
				XSSFCell cell1 = row.getCell(1);
				XSSFCell cell2 = row.getCell(2);
				XSSFCell cell3 = row.getCell(3);
				int sid = (int) cell.getNumericCellValue();
				if (id == sid) {
					std.setId((int) cell.getNumericCellValue());
					std.setName(cell1.getStringCellValue());
					std.setMarks((int) cell2.getNumericCellValue());
					std.setQual(cell3.getStringCellValue());
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}

}
