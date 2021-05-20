package com.codewithraju.excel.xls.ConsoleTOxls;

import java.util.Scanner;

import com.codewithraju.pojo.product;

public class productMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
		ProductWriter writer = new ProductWriter();
		writer.saveProduct(p);
		System.out.println("Console To Excel xls Date Transfered Succssfully....");
	}

}
