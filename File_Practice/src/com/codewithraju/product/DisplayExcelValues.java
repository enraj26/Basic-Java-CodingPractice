package com.codewithraju.product;

import java.util.ArrayList;

public class DisplayExcelValues {

	public static void main(String[] args) {

		ExcelReader excReader = new ExcelReader();
		ArrayList<Product> readExcelDate = excReader.readExcelDate();
		for (int i = 0; i < readExcelDate.size(); i++) {
			Product product = readExcelDate.get(i);
			System.out.println(product.id + "," + product.name + "," + product.price + "," + product.avail);
		}

	}

}
