package com.codewithraju.basicpractice;

public class PowerBill {

	public static void main(String[] args) {
		double previousReading = 3000;
		double currentReading = 3500;
		double units = currentReading - previousReading;
		System.out.println(units);
		double bill = 0.0;
		if (units < 100) {
			bill = units * 1;
		} else if (units >= 100 & units < 200) {
			bill = units * 2;
		} else if (units >= 200 & units < 300) {
			bill = units * 3;
		} else if (units >= 300) {
			bill = units * 4;
		}
		System.out.println(bill);
	}

}
