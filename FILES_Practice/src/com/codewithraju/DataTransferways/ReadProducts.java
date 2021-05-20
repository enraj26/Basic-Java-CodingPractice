package com.codewithraju.DataTransferways;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class ReadProducts {

	public product readproducts(int id) {
		product p = new product();
		try {
			FileReader fr = new FileReader("E:\\SIVA\\TEST\\product.txt");
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			while (readLine != null) {
				String[] split = readLine.split(",");
				int pid = Integer.parseInt(split[0]);
				if (id == pid) {
					p.setId(id);
					p.setName(split[1]);
					p.setPrice(Double.parseDouble(split[2]));
					p.setAvail(Integer.parseInt(split[3]));
					break;
				}
				readLine = br.readLine();
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public ArrayList<String> readProductsBycolor(String color) {
		ArrayList<String> strList = new ArrayList<>();
		try {
			FileReader fr = new FileReader("E:\\SIVA\\TEST\\product1.txt");
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			while (readLine != null) {
				String[] split = readLine.split(",");
				if (color.equals(split[4])) {
					String productNames = split[1];
					strList.add(productNames);
				}
				readLine = br.readLine();
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strList;
	}

	public ArrayList<product> readAllProducts() {
		ArrayList<product> proList = new ArrayList<>();
		try {
			FileReader fr = new FileReader("E:\\SIVA\\TEST\\product.txt");
			BufferedReader br = new BufferedReader(fr);
			String readLine = br.readLine();
			while (readLine != null) {
				String[] split = readLine.split(",");
				product p = new product();
				p.setId(Integer.parseInt(split[0]));
				p.setName(split[1]);
				p.setPrice(Double.parseDouble(split[2]));
				p.setAvail(Integer.parseInt(split[3]));
				proList.add(p);
				readLine = br.readLine();
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proList;
	}
}
