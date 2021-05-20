package com.codewithraju.excel;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class StudentMain {

	public static void main(String[] args) {

		StudentDataReader sdr = new StudentDataReader();
		ArrayList<Student> getStudentsList = sdr.getStudents();
		
		try {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet createSheet = workbook.createSheet();
		
		for (int i = 0; i < getStudentsList.size(); i++) {
			HSSFRow row = createSheet.createRow(i);
			Student student = getStudentsList.get(i);
			row.createCell(0).setCellValue(student.id);
			row.createCell(1).setCellValue(student.name);
			row.createCell(2).setCellValue(student.qual);
			row.createCell(3).setCellValue(student.marks);
		}

		FileOutputStream fos = new FileOutputStream("E:\\RAJU\\TEST\\b.xls");
		workbook.write(fos);
		fos.close();
		System.out.println("Done....");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
