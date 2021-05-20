package com.codewithraju.DataTransferways;

import java.util.ArrayList;

import com.codewithraju.pojo.product;

public class SingleValueToMultipuleGroupOfValues {
	
	public static void main(String[] args) {
		
		ReadProducts read = new ReadProducts();
		ArrayList<product> readAllProducts = read.readAllProducts();
		for(int i=0;i<readAllProducts.size();i++) {
			product product = readAllProducts.get(i);
			System.out.println(product.getId()+","+product.getName()+","+product.getPrice()+","+product.getAvail());
		}
		
	}

}
