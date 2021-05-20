package com.codewithraju.basicpractice;

public class ProfitPercentage {
	
	public static void main(String[] args) {
		
		double cp = 100;
		double sp = 100;
		
		if(sp > cp) {
			System.out.println("PROFIT");
			double profit = sp - cp;
			double profitPercentage = profit * 100/cp;
			System.out.println(profitPercentage);
		} else if(cp > sp) {
			System.out.println("LOSS");
			double loss = cp -sp;
			double lossPercentage = loss * 100 /cp;
			System.out.println(lossPercentage);
		}
		else {
			System.out.println("NO PROFIT NO LOSS");
		}
	}

}
