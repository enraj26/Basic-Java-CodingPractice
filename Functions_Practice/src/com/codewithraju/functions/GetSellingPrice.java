package com.codewithraju.functions;

public class GetSellingPrice {

	public static void main(String[] args) {

		int product1 = 290;
		int product2 = 234;
		int product3 = 345;

		int Product1SellingPrice = getSellingPrice(product1);
		int Product2SellingPrice = getSellingPrice(product2);
		int Product3SellingPrice = getSellingPrice(product3);
		System.out.println(Product1SellingPrice);
		System.out.println(Product2SellingPrice);
		System.out.println(Product3SellingPrice);

	}

	static int getSellingPrice(int costPrice) {
		int profit = costPrice * 30 / 100;
		int sellinPrice = costPrice + profit;
		return sellinPrice;
	}

}
