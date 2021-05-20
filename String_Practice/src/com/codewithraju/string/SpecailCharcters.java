package com.codewithraju.string;

public class SpecailCharcters {

	public static void main(String[] args) {

		String str = "H324665gfutd1";
		int specialCharCount = getSpecailChartcetrsCount(str);
		System.out.println(specialCharCount);
	}

	static int getSpecailChartcetrsCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!((ch >= 65 & ch <= 90) | (ch >= 97 & ch <= 122))) {
				count++;
			}
		}
		return count;

	}

}
