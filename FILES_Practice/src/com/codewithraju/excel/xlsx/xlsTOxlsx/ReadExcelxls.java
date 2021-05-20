package com.codewithraju.excel.xlsx.xlsTOxlsx;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.codewithraju.pojo.product;

public class ReadExcelxls {

	public ArrayList<product> getProducts() {
		ArrayList<product> proList = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("E:\\SIVA\\TEST\\student.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheetAt = wb.getSheetAt(0);
			int lastRowNum = sheetAt.getLastRowNum();
			for (int i = 0; i <= lastRowNum; i++) {
				HSSFRow row = sheetAt.getRow(i);
				HSSFCell cell = row.getCell(0);
				HSSFCell cell1 = row.getCell(1);
				HSSFCell cell2 = row.getCell(2);
				HSSFCell cell3 = row.getCell(3);
				product pro = new product();
				pro.setId((int) cell.getNumericCellValue());
				pro.setName(cell1.getStringCellValue());
				pro.setPrice(cell2.getNumericCellValue());
				pro.setAvail((int) cell3.getNumericCellValue());
				proList.add(pro);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proList;
	}

}
