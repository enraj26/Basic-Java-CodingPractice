package com.codewithraju.excel.xlsx.consoleTOxlsX;

import java.util.Scanner;

import com.codewithraju.pojo.power;

public class PowerBillMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Previous Reading : ");
		double previousReading = Double.parseDouble(sc.nextLine());

		System.out.println("Enter Current Reading : ");
		double currentReading = Double.parseDouble(sc.nextLine());

		System.out.println("Enter Unit Rate : ");
		double unitRate = Double.parseDouble(sc.nextLine());

		power pow = new power();
		pow.setPreviousReading(previousReading);
		pow.setCurrentReading(currentReading);
		pow.setUnitRate(unitRate);
		PowerBillWriter pbw = new PowerBillWriter();
		pbw.savePowerBill(pow);
		System.out.println("Read Data From Console To Write Data Excel xlsx.....");
	}

}
