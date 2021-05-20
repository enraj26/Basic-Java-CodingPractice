package com.codewithraju.file.FileTOFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class ReadFile {
	
	public ArrayList<product> getProducts() {
		ArrayList<product> proList = new ArrayList<>();
		try {
			FileReader fr = new FileReader("E:\\SIVA\\TEST\\product.txt");
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			while(readLine != null) {
				String[] split = readLine.split(",");
				product p = new product();
				p.setId((Integer.parseInt(split[0])));
				p.setName(split[1]);
				p.setPrice(Double.parseDouble(split[2]));
				p.setAvail(Integer.parseInt(split[3]));
				proList.add(p);
				readLine = br.readLine();
			}
			br.close();
			fr.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return proList;
	}

}
