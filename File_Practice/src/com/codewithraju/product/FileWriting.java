package com.codewithraju.product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileWriting {

	public void writeTextFile(ArrayList<Product> productList) {
		try {
			FileWriter fw = new FileWriter("E:\\RAJU\\TEST\\prodct.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < productList.size(); i++) {
				Product product = productList.get(i);
				bw.write(product.id + "," + product.name + "," + product.price + "," + product.avail);
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
