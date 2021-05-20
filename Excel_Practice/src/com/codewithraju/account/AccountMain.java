package com.codewithraju.account;

import java.util.Scanner;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Num : ");
		long accountNo = Long.parseLong(sc.nextLine());
		
		System.out.println("Enter Account Name : ");
		String accountName = sc.nextLine();
		
		System.out.println("Enter IFSC : ");
		String ifsc = sc.nextLine();
		
		System.out.println("Enter Branch : ");
		String branch = sc.nextLine();
		
		System.out.println("Enter Balance : ");
		double balnce = Double.parseDouble(sc.nextLine());
		
		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setAccountName(accountName);
		account.setIfsc(ifsc);
		account.setBranch(branch);
		account.setBalance(balnce);
		
		ExcelWriterAccount writerFile = new ExcelWriterAccount();
		writerFile.writingExcelXlsxFile(account);
		System.out.println("Done.....");
	}

}
