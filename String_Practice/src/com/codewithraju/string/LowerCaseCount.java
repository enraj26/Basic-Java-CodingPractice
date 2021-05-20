package com.codewithraju.string;

public class LowerCaseCount {

	public static void main(String[] args) {
		String str = "Hello I am From Ongole";
		int count = getLowerCount(str);
		System.out.println(count);
	}

	static int getLowerCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			int ascii = charAt;
			if (ascii >= 97 & ascii <= 122) {
				count++;
			}
		}
		return count;
	}

}
