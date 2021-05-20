package com.codewithraju.string;

public class TestStringCharacter {

	public static void main(String[] args) {

		String str = "Hello World , I Am FRom Earth....,";

		System.out.println("Captail Charcters Of Given String");
		for (int i = 0; i < str.length(); i++) {
			char captailCharcters = str.charAt(i);
			if (captailCharcters >= 65 && captailCharcters <= 90) {
				System.out.print(captailCharcters + " ");
			}
		}

		System.out.println("------------------------");

		System.out.println("Small Charcters Of Given String");
		for (int i = 0; i < str.length(); i++) {
			char smallCharters = str.charAt(i);
			if (smallCharters >= 97 && smallCharters <= 122) {
				System.out.print(smallCharters + " ");
			}
		}

		System.out.println("------------------------");

		System.out.println("Captail Charcters Count Of Given String");
		int CCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char captailChartersCount = str.charAt(i);
			if (captailChartersCount >= 65 && captailChartersCount <= 90) {
				CCount++;
			}
		}
		System.out.println(CCount);

		int SCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				SCount++;
			}
		}
		System.out.println("Small Charcters Count Of Given String : " + SCount);

		System.out.println("Even Index Charcter Of Given String");
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				char evenIndexCharAt = str.charAt(i);
				System.out.print(evenIndexCharAt + " ");
			}
		}
		System.out.println("||");

		System.out.println("Odd Index Charcter Of Given String");
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0) {
				char oddIndexCharAt = str.charAt(i);
				System.out.print(oddIndexCharAt + " ");
			}
		}

		System.out.println("---------------");

		System.out.println("Five Words Of Given String :");
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (split[i].length() >= 5) {
				System.out.print(split[i] + " ");
			}
		}

		System.out.println("--------------");
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char charAt = str.charAt(i);
			rev = rev + charAt;
		}
		System.out.println("Reverse Of The Given String : " + rev);

		String[] split2 = str.split(" ");
		for (int i = split2.length - 1; i >= 0; i--) {
			System.out.print(split2[i] + " ");
		}
		
		System.out.println("-------");
		System.out.println("No Of Charcters Of Given String : "+str.length());
		
		String[] split3 = str.split(" ");
		System.out.println("No Of Words Of Given String :"+split3.length);
		
		System.out.println("Ascii Charcters Of Given String : ");
		for(int i=0;i<str.length();i++) {
			char charAt = str.charAt(i);
			int ascii = charAt;
			System.out.print(ascii+" ");
		}
		
		System.out.println("---------");
		int spcount =0;
		for(int i=0;i<str.length();i++) {
			char charAt = str.charAt(i);
			if(!((charAt>=65 && charAt<=90)||(charAt>=97 && charAt<=122))) {
				spcount++;
			}
		}
		System.out.println("specail charcters count----"+spcount);
	}

}
