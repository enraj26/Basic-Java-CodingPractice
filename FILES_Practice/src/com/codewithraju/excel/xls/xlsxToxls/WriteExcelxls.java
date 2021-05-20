package com.codewithraju.excel.xls.xlsxToxls;

import java.io.FileOutputStream;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.codewithraju.pojo.product;

public class WriteExcelxls {
	public void saveProducts(ArrayList<product> products) {
		try {
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet createSheet = wb.createSheet();
			for (int i = 0; i < products.size(); i++) {
				HSSFRow createRow = createSheet.createRow(i);
				product product = products.get(i);
				HSSFCell createCell0 = createRow.createCell(0);
				createCell0.setCellValue(product.getId());
				HSSFCell createCell1 = createRow.createCell(1);
				createCell1.setCellValue(product.getName());
				HSSFCell createCell2 = createRow.createCell(2);
				createCell2.setCellValue(product.getPrice());
				HSSFCell createCell3 = createRow.createCell(3);
				createCell3.setCellValue(product.getAvail());
				FileOutputStream fos = new FileOutputStream("E:\\SIVA\\TEST\\product.xls");
				wb.write(fos);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
