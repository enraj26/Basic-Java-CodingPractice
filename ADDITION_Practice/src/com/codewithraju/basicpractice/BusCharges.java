package com.codewithraju.basicpractice;

public class BusCharges {

	public static void main(String[] args) {
		double kms = 10;
		double rate = 0.0;
		if (kms < 5) {
			rate = kms * 2;
		} else if (kms > 5 & kms < 10) {
			rate = kms * 4;
		} else if (kms >= 10 & kms < 20) {
			rate = kms * 6;
		} else if (kms >= 20) {
			rate = kms * 8;
		}
		System.out.println(rate);
	}

}
