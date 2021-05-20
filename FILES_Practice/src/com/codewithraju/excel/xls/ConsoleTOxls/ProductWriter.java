package com.codewithraju.excel.xls.ConsoleTOxls;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.codewithraju.pojo.product;

public class ProductWriter {

	public void saveProduct(product pro) {

		try {
			FileWriter fw = new FileWriter("E:\\SIVA\\TEST\\proconsole.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(pro.getId() + "," + pro.getName() + "," + pro.getPrice() + "," + pro.getAvail());
			bw.newLine();
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
