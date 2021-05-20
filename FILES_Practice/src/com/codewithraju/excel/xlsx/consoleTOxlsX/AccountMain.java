package com.codewithraju.excel.xlsx.consoleTOxlsX;

import java.util.Scanner;

import com.codewithraju.pojo.account;

public class AccountMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		long accountNumber = Long.parseLong(sc.nextLine());

		System.out.println("Enter Account Name : ");
		String accountName = sc.nextLine();

		System.out.println("Enter IFSC : ");
		String ifsc = sc.nextLine();

		System.out.println("Enter Branch :");
		String branch = sc.nextLine();

		System.out.println("Enter Balance : ");
		double balance = Double.parseDouble(sc.nextLine());

		account acc = new account();
		acc.setAccountNumber(accountNumber);
		acc.setAccountName(accountName);
		acc.setIfsc(ifsc);
		acc.setBranch(branch);
		acc.setBalance(balance);

		AccountWriter writer = new AccountWriter();
		writer.saveAccount(acc);
		System.out.println("DONE.......");
	}

}
