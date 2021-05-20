package com.codewithraju.string;

public class CaptailCount {

	public static void main(String[] args) {

		String str = "Hello I am From India";
		int count = getUpperCaseCount(str);
		System.out.println(count);
	}

	static int getUpperCaseCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			int ascii = charAt;
			if (ascii >= 65 & ascii <= 90) {
				count++;
			}
		}
		return count;

	}

}
