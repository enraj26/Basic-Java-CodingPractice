package com.codewithraju.excel.xls.ConsoleTOxls;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class ProductMultipuleWriter {

	public void saveProduct(ArrayList<product> pro) {

		try {
			FileWriter fw = new FileWriter("E:\\SIVA\\TEST\\promultipuleconsole.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < pro.size(); i++) {
				product product = pro.get(i);
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
