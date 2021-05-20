package com.codewithraju.file.xlsxToFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class WriteTextFile {

	public void saveProducts(ArrayList<product> proList) {
		try {
			FileWriter fw = new FileWriter("E:\\SIVA\\TEST\\protext.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < proList.size(); i++) {
				product product = proList.get(i);
				bw.write(product.getId() + "," + product.getName() + "," + product.getPrice() + ","
						+ product.getAvail());
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
