package com.codewithraju.basicpractice;

public class PERCENTAGE {
	
	public static void main(String[] args) {
		
		int profit = 1200;
		int profitPercentage = 24;
		int costPrice = 100 * profit / profitPercentage;
		System.out.println(costPrice);
		
		int cp = 200;
		int sp = 500;
		int pf = sp - cp;
		System.out.println(pf);
		int pp =  pf * 100 / cp;
		System.out.println(pp);
		
	}

}
