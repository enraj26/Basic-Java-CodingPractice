package com.codewithraju.DataTransferways;

import java.util.Scanner;

import com.codewithraju.pojo.product;

public class SingleValueToRelatedGroupOfValuesMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ProductId : ");
		int productId = Integer.parseInt(sc.nextLine());
		ReadProducts read = new ReadProducts();
		product productInfo = read.readproducts(productId);
		System.out.print(productInfo.getId()+","+productInfo.getName()+","+productInfo.getPrice()+","+productInfo.getAvail());
		
	}

}
