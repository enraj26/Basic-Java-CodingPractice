package com.codewithraju.excel.xlsx.consoleTOxlsX;

import java.util.ArrayList;
import java.util.Scanner;

import com.codewithraju.pojo.power;

public class MultipulePowerBillMain {

	public static void main(String[] args) {
		ArrayList<power> powList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Power Bills You Have.......");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Enter Current Reading....");
			int currentReading = sc.nextInt();

			System.out.println("Enter Previous Reading....");
			int previousReading = sc.nextInt();

			System.out.println("Enter Unit Rate.....");
			int unitRate = sc.nextInt();

			power pow = new power();
			pow.setCurrentReading(currentReading);
			pow.setPreviousReading(previousReading);
			pow.setUnitRate(unitRate);
			powList.add(pow);

		}
		MultipulePowerWriter writer = new MultipulePowerWriter();
		writer.saveMultipulePowerBills(powList);
		System.out.println("Multipule Rows Saved in Console To Write Excel xlsx File.......");
	}

}
