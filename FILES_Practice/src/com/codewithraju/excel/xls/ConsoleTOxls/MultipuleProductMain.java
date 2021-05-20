package com.codewithraju.excel.xls.ConsoleTOxls;

import java.util.ArrayList;
import java.util.Scanner;

import com.codewithraju.pojo.product;

public class MultipuleProductMain {
	public static void main(String[] args) {
		ArrayList<product> proList = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many Products You Have...  : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++) {
			System.out.println("Enter Product Id : ");
			int id = Integer.parseInt(sc.nextLine());

			System.out.println("Enter Product Name : ");
			String name = sc.nextLine();

			System.out.println("Enter Product Price : ");
			double price = Double.parseDouble(sc.nextLine());

			System.out.println("Enter Product Avail : ");
			int avail = Integer.parseInt(sc.nextLine());

			product p = new product();
			p.setId(id);
			p.setName(name);
			p.setPrice(price);
			p.setAvail(avail);
			proList.add(p);
		}
		ProductMultipuleWriter writer = new ProductMultipuleWriter();
		writer.saveProduct(proList);
		System.out.println("Console To Excel xls Multipule  Data Transfered Succssfully....");
	}

}
