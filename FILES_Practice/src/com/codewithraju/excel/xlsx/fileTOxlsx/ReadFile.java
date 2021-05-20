package com.codewithraju.excel.xlsx.fileTOxlsx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class ReadFile {

	public ArrayList<product> getProduct() {
		ArrayList<product> proList = new ArrayList<>();
		try {
			FileReader fr = new FileReader("E:\\SIVA\\TEST\\product.txt");
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			while (readLine != null) {
				String[] split = readLine.split(",");
					product pro = new product();
					pro.setId(Integer.parseInt(split[0]));
					pro.setName(split[1]);
					pro.setPrice(Double.parseDouble(split[2]));
					pro.setAvail(Integer.parseInt(split[3]));
					readLine = br.readLine();
					proList.add(pro);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proList;
	}

}
