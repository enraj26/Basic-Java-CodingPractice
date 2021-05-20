package com.codewithraju.excel.xls.fileTOxls;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.codewithraju.pojo.product;

public class WriteExcelxls {

	public void saveProducts(ArrayList<product> proList) {
		try {
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet createSheet = wb.createSheet();
			for (int i = 0; i < proList.size(); i++) {
				product product = proList.get(i);
				HSSFRow createRow = createSheet.createRow(i);
				createRow.createCell(0).setCellValue(product.getId());
				createRow.createCell(1).setCellValue(product.getName());
				createRow.createCell(2).setCellValue(product.getPrice());
				createRow.createCell(3).setCellValue(product.getAvail());
				FileOutputStream fos = new FileOutputStream("E:\\SIVA\\TEST\\proExcel.xls");
				wb.write(fos);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
