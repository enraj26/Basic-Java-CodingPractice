package com.codewithraju.excel.xlsx.xlsTOxlsx;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codewithraju.pojo.product;

public class WriteExcelxlsx {

	public void saveProducts(ArrayList<product> products) {
		try {
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet createSheet = wb.createSheet();
			for (int i = 0; i < products.size(); i++) {
				XSSFRow createRow = createSheet.createRow(i);
				product product = products.get(i);
				createRow.createCell(0).setCellValue(product.getId());
				createRow.createCell(1).setCellValue(product.getName());
				createRow.createCell(2).setCellValue(product.getPrice());
				createRow.createCell(3).setCellValue(product.getAvail());
				FileOutputStream fos = new FileOutputStream("E:\\SIVA\\TEST\\student.xlsx");
				wb.write(fos);
				fos.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
