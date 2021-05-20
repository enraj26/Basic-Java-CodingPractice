package com.codewithraju.excel.xlsx.fileTOxlsx;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codewithraju.pojo.product;

public class WriteExcelxlsx {
	
	public void saveproduct(ArrayList<product> pro) {
		
		try {
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet();
			
			for(int i=0;i<pro.size();i++) {
				XSSFRow createRow = sheet.createRow(i);
				XSSFCell cell0 = createRow.createCell(0);
				XSSFCell cell1 = createRow.createCell(1);
				XSSFCell cell2 = createRow.createCell(2);
				XSSFCell cell3 = createRow.createCell(3);
				
				product product = pro.get(i);
				cell0.setCellValue(product.getId());
				cell1.setCellValue(product.getName());
				cell2.setCellValue(product.getPrice());
				cell3.setCellValue(product.getAvail());
				FileOutputStream fos = new FileOutputStream("E:\\SIVA\\TEST\\product.xlsx");
				wb.write(fos);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
