package com.codewithraju.product;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteFileByName {

	public void writeProductFile(ArrayList<Product> products) {

		try {
			FileWriter fw = new FileWriter("E:\\RAJU\\TEST\\prodct1.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < products.size(); i++) {
				Product product = products.get(i);
				bw.write(product.id + "," + product.name + "," + product.price + "," + product.avail);
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ExcelProductFile(ArrayList<Product> products) {

		try {
			FileInputStream fis = new FileInputStream("E:\\RAJU\\TEST\\product1.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheet = wb.getSheetAt(0);
			int lastRowNum = sheet.getLastRowNum();
			System.out.println(lastRowNum);
			for (int i =0; i < products.size(); i++) {
				Product product = products.get(i);
				HSSFRow createRow = sheet.createRow(lastRowNum+1);
				HSSFCell createCell = createRow.createCell(0);
				createCell.setCellValue(product.id);
				
				HSSFCell createCell1 = createRow.createCell(1);
				createCell1.setCellValue(product.name);
				
				HSSFCell createCell2 = createRow.createCell(2);
				createCell2.setCellValue(product.price);
				
				HSSFCell createCell3 = createRow.createCell(3);
				createCell3.setCellValue(product.avail);
				FileOutputStream fos = new FileOutputStream("E:\\RAJU\\TEST\\product1.xls");
				wb.write(fos);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
