package com.codewithraju.xml.XLSTOXML;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.codewithraju.pojo.student;

public class ReadExcelXLS {

	public student getStudents(int id, String file) {
		student std = new student();
		try {
			FileInputStream fis = new FileInputStream(file);
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheetAt = wb.getSheetAt(0);
			int lastRowNum = sheetAt.getLastRowNum();
			for (int i = 0; i < lastRowNum; i++) {
				HSSFRow row = sheetAt.getRow(i);
				HSSFCell cell0 = row.getCell(0);
				HSSFCell cell1 = row.getCell(1);
				HSSFCell cell2 = row.getCell(2);
				HSSFCell cell3 = row.getCell(3);
				int sid = (int) cell0.getNumericCellValue();
				if (id == sid) {
					std.setId((int) cell0.getNumericCellValue());
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
