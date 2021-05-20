package com.codewithraju.employee;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteEmployeeDataById {

	public void createEmployeeTextFileById(Employee emp) {
		try {
			FileWriter fw = new FileWriter("E:\\RAJU\\TEST\\Employee.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(emp.id+","+emp.name+","+emp.salary+","+emp.qual);
			bw.newLine();
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
