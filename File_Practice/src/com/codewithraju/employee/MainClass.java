package com.codewithraju.employee;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id = sc.nextInt();
		GetEmployeDataByIDInExcel empData = new GetEmployeDataByIDInExcel();
		Employee employeeData = empData.getEmployeeData(id);
		WriteEmployeeDataById writeTextFile = new WriteEmployeeDataById();
		writeTextFile.createEmployeeTextFileById(employeeData);
		System.out.println("DONE.....");

	}

}
