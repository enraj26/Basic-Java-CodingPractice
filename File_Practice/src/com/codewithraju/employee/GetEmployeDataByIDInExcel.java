package com.codewithraju.employee;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GetEmployeDataByIDInExcel {

	public Employee getEmployeeData(double id) {
		Employee employee = new Employee();
		try {
			FileInputStream fis = new FileInputStream("E:\\RAJU\\TEST\\Employee.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheetAt = wb.getSheetAt(0);

			int lastRowIndexNum = sheetAt.getLastRowNum();
			for (int i = 0; i <= lastRowIndexNum; i++) {

				HSSFRow row = sheetAt.getRow(i);
				HSSFCell cell0 = row.getCell(0);
				HSSFCell cell1 = row.getCell(1);
				HSSFCell cell2 = row.getCell(2);
				HSSFCell cell3 = row.getCell(3);

				if (id == cell0.getNumericCellValue()) {
					employee.id = (int) cell0.getNumericCellValue();
					employee.name = cell1.getStringCellValue();
					employee.salary = cell2.getNumericCellValue();
					employee.qual = cell3.getStringCellValue();
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

}
